package com.servlet3;

/**
 * Created by gadalaya on 7/15/2017.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;
        import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpSessionDemo2 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            //retrieve new ssn, hence true parameter is sent
            HttpSession ssn=request.getSession(true);
          //  String n=request.getParameter("userName");

            //retrieve the attribute uname, from the ssn
            //invoke removeAttribute() if you want to remove any attribute
            //stored in the ssn
            //session.removeAttribute("attribute_name");

            //use invalidate method to completely destroy current ssn
            //so that it doesn't exist any more
            out.print("you are logging out ");
            ssn.invalidate();
            out.print("you are logged out ");


            out.close();

        }catch(Exception e){System.out.println(e);}
    }


}