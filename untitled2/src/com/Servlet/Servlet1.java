package com.Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by gadalaya on 7/15/2017.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
        request.setAttribute("abc", "this_parameter_added_by_servlet");
        //forwards request to WelcomeServlet, and discards output from
        //current servlet(if any)
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
        request.setAttribute("abc", "this_parameter_added_by_servlet");
        //forwards request to WelcomeServlet, and discards output from
        //current servlet(if any)
        rd.forward(request, response);
    }
}
