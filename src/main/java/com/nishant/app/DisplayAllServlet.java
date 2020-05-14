package com.nishant.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/DisplayAllServlet",urlPatterns = ("/DisplayAllServlet"))
public class DisplayAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppApplication.class);
        Helper helper=(Helper)ctx.getBean(Helper.class);
        List<URLs> urLs=helper.findAll();
        request.setAttribute("result",urLs);
        request.getRequestDispatcher("viewAll.jsp").forward(request, response);
    }
}
