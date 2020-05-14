package com.nishant.app;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "/UrlToTinyServlet",urlPatterns = ("/UrlToTinyServlet"))
public class UrlToTinyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url=request.getParameter("url");
        if(url==null || url.equals(""))
        {
            System.out.println("URL can not be empty");
            throw new ServletException("URL can not be empty.");
        }
        else
        {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppApplication.class);
            Helper helper=(Helper)ctx.getBean(Helper.class);
            URLs obj=helper.findByUrl(url);
            if(obj==null) {
                System.out.println("URL not found... Adding to the database");
                obj=new URLs();
                obj.setUrl(url);
                helper.saveToDB(obj);
            }
            else {
                System.out.println("URL found...");
            }
            request.setAttribute("result", Collections.singletonList(obj));
            request.getRequestDispatcher("viewAll.jsp").forward(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
