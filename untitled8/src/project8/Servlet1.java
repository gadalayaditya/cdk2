package project8;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by gadalaya on 7/20/2017.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cdk";
    static final String USER = "root";
    static final String PASS = "CDKcdk11";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");


        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String pass = request.getParameter("pass1");


        try {
            //STEP 2: Register and Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection to database server

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query


            stmt = conn.prepareStatement("insert into validation values(?, ?, ?, ?)");
            stmt.setString(1, name);

            stmt.setString(2, id);
            stmt.setString(3, pass);

           if(request.getParameter("textbox")==null || request.getParameter("textbox") == "")
               stmt.setString(4,null);
           else
            stmt.setInt(4, Integer.parseInt(request.getParameter("textbox")) );
            int cnt = stmt.executeUpdate();
            if(cnt>0)
            {
                out.println("Successfully inserted...");
            }
            else
            {
                out.println("Error inserting...");
            }

            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            out.println("sqlexception <br> id already exists try anoher one");
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
