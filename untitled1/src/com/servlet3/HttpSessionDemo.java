package com.servlet3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class HttpSessionDemo extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        //create new session
        HttpSession session=request.getSession();
        
        //set the attribute uname to the session
        //which can be further retrieved, in other servlets
        //as long as session is valid
        //Attribute value can be of any type, since Object is expected parameter
        session.setAttribute("uname",n);
                out.print("\n Hello "+n);
                //setMaxInactiveInterval(int interval),
        //container invalidates session, if no requests from client, for a certain time(in seconds)
  
       out.print("<a href='HttpSessionDemo1'>visit</a>");
                session.invalidate();
                out.print("\n You are logged out"+n);
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  