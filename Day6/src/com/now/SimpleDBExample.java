package com.now;
//import sql package
import java.sql.*;

public class SimpleDBExample {
   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/cdk";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "CDKcdk11";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
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

           id  = rs.getInt("sid");

           String name = rs.getString("sname");

           int age = rs.getInt("age");

           //Display values
           System.out.print("Row Number:"+rs.getRow());
           System.out.print("ID: " + id);
           System.out.print(", Age: " + age);
           System.out.println(", Name: " + name);

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
}//end main
}

