package com.nishant.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/AppExceptionHandler",urlPatterns = ("/AppExceptionHandler"))
public class AppExceptionHandler extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        execute(request, response);
    }
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        execute(request, response);
    }
    private void execute(HttpServletRequest request,
                              HttpServletResponse response) throws IOException, ServletException {
        Throwable throwable = (Throwable) request
                .getAttribute("javax.servlet.error.exception");
        Integer statusCode = (Integer) request
                .getAttribute("javax.servlet.error.status_code");
        if(statusCode==500)
            request.setAttribute("message",throwable.getMessage());
        else
            request.setAttribute("message","");
        request.setAttribute("code",statusCode);
        request.getRequestDispatcher("problemHandler.jsp").forward(request,response);
    }
}
