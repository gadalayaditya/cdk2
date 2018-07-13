package com.reqred;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;
import java.sql.*;
  
public class LoginServlet extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cdk";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "CDKcdk11";
    Connection conn = null;
    Statement stmt = null;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");

        out.println("Before if statement");
        if (validateLogin(n, p))//success
        {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            request.setAttribute("abc", "this_parameter_added_by_servlet");
            //forwards request to WelcomeServlet, and discards output from
            //current servlet(if any)
            rd.forward(request, response);
        } else //failure
        {
            out.print("Sorry UserName or Password Error!");

            //instead of index.html, any servlet also can be used or included
            RequestDispatcher rd = request.getRequestDispatcher("/indexreq.html");

            request.setAttribute("def", "this_parameter_added_by_servlet");

            //index.html page is included in the output along with message from current servlet
            rd.include(request, response);

            out.print("This is after include");
        }
    }

    private boolean validateLogin(String usrnam, String passwd) {
      /*  if(passwd.equals("simplepass") && usrnam.equalsIgnoreCase("JAVA652"))
        {
            return true;
        }
        else
        {
            return false;
        }
        */
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql;
            sql = "SELECT * FROM login";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("pass");

                if (passwd.equals("id") && usrnam.equalsIgnoreCase("name")) {
                    return true;
                } else {
                    return false;
                }
            }

            stmt.close();
            conn.close();

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    return false;}

}