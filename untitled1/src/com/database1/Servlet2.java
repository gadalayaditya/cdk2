package com.database1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by gadalaya on 7/15/2017.
 */
@WebServlet(name = "Servlet2")
public class Servlet2 extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cdk";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "CDKcdk11";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;

        Statement stmt = null;
        PrintWriter out = response.getWriter();
       // out.print("hiii");

        try{
            //STEP 2: Register and Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection to database server
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            String sql;
            sql = "SELECT * FROM customers";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                //Can retrieve values with column index also eg. getInt(int column_index);
                int id=0;

                id  = rs.getInt("cust_id");

                String name = rs.getString("cust_name");

                int age = rs.getInt("cust_plan");
                //Display values
               out.println("Row Number:"+rs.getRow());
               out.println("ID: " + id);
               out.println(", Age: " + age);
                out.println(", Name: " + name);

                //printDisplayDirection(rs);
            }
            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        System.out.println("Done...");
    }
}
