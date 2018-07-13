package com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by gadalaya on 7/17/2017.
 */
@WebServlet(name = "ServletMain")
public class ServletMain extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Welcome to Main<br>");

        RequestDispatcher rd1 = request.getRequestDispatcher("Servlet1");
        RequestDispatcher rd2 = request.getRequestDispatcher("example.html" );
        rd1.include(request, response);
        rd2.include(request, response);
        out.println(request.getAttribute("def"));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}

