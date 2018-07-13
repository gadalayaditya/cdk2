package com.servlet3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class HttpSessionDemo1 extends HttpServlet {  
  
    @Override
public void doGet(HttpServletRequest request, HttpServletResponse response)  
{
        try{
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        //retrieve existing ssn, hence false parameter is sent
        HttpSession ssn=request.getSession(false);

        //retrieve the attribute uname, from the ssn
        String n=(String)ssn.getAttribute("uname");  
        out.print("Hello "+n);  
  
        //invoke removeAttribute() if you want to remove any attribute
        //stored in the ssn
        //session.removeAttribute("attribute_name");
        
        //use invalidate method to completely destroy current ssn
        //so that it doesn't exist any more

                //ssn.invalidate();
        
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  