/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.util.List; 
import java.util.HashMap;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLManageEmployee {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      try{
          //step 1: Create Session Factory
         factory = new Configuration().configure().buildSessionFactory();
      }catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      HQLManageEmployee ME = new HQLManageEmployee();

      ME.listEmployeesFull();
      
      System.out.println("---------------------------------");
      /* List down all the employees */
      ME.listEmployees();
   }

   /* HQL example to retrieve, when more than one field is selected */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();

         //Query qry = session.createQuery("SELECT Y.firstName, Y.lastName FROM "
         //        + "Employee Y WHERE Y.salary >9000");

         Query qry = session.createQuery("SELECT firstName, lastName FROM "
                 + "Employee WHERE salary >9000");

          List<Object []> employees = qry.list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Object [] emp =  (Object [])iterator.next(); 

            System.out.println(emp[0]+" --- "+emp[1]);
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   
   /* HQL example to retrieve, when more than one field is selected */
   public void listEmployeesFull( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();

         Query qry = session.createQuery("FROM Employee");

          List employees = qry.list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
             Employee eObj = (Employee)iterator.next();
             System.out.println(eObj);
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}
