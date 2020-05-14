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
import java.util.Arrays;
import java.util.Collections;

@WebServlet(name = "/TinyToUrlServlet",urlPatterns = ("/TinyToUrlServlet"))
public class TinyToUrlServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tiny=request.getParameter("tiny");
        if(tiny==null || tiny.equals(""))
        {
            System.out.println("Tiny URL can not be empty.");
            throw new ServletException("Tiny URL can not be empty.");
        }
        else
        {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppApplication.class);
            Helper helper=(Helper)ctx.getBean(Helper.class);
            URLs obj=null;
            try{
                obj = helper.findById(tiny);
                request.setAttribute("result", Collections.singletonList(obj));
                request.getRequestDispatcher("viewAll.jsp").forward(request, response);

            } catch(Exception exception)
            {
                System.out.println("Invalid Tiny URL");
                throw new ServletException("Tiny URL is not valid.");
            }

        }
    }
}
