package proj6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.sql.*;

/**
 * Created by gadalaya on 7/19/2017.
 */
@WebServlet(name = "ServletMain")
public class ServletMain extends HttpServlet {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cdk";
    static final String USER = "root";
    static final String PASS = "CDKcdk11";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String st1 = (String) request.getAttribute("key");
        Long t1 = (Long) request.getAttribute("time");
        t1=t1/1000;
        try {
            //STEP 2: Register and Load JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection to database server

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query

            stmt = conn.createStatement();

            String sql;
            sql = "select ptime from timepages where pageno='"+st1+"'";

            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set

           while(rs.next()){
                //Retrieve by column name

                int first = rs.getInt("ptime");
                //out.print(first);

                t1= t1+first;
                sql = "update timepages set ptime="+t1+" where pageno='"+st1+"'";

                int rows_affected = stmt.executeUpdate(sql);
                if (rows_affected > 0) {
                    System.out.println("Successfully updated " + rows_affected);
                    out.println("Successfully updated " + rows_affected+"row");
                } else {
                    System.out.println("Updation failed.");
                    out.println("Updation failed.");
                }
           }
            rs.close();
            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
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
