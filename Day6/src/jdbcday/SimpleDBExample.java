package jdbcday;
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
      sql = "update plans set plan_name='plan3' where plan_id=3";
      int rows_affected = stmt.executeUpdate(sql);

            
      if(rows_affected>0)
      {
    	  System.out.println("Successfully updated "+rows_affected);
      }
      else
      {
    	  System.out.println("Updation failed.");
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

