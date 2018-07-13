//import javax.persistence.*;
//
//@javax.persistence.Entity
//@Table(name="employee")
public class Employee {
   private int id;
   private String firstName; 
   private String lastName;   
   private int salary;
   private String address;

   public Employee() {}
   public Employee(String fname, String lname, int salary,String address) {
      this.firstName = fname;
      this.lastName = lname;
      this.salary = salary;
      this.address = address;
   }
   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   public int getSalary() {
      return salary;
   }
   public void setSalary( int salary ) {
      this.salary = salary;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress( String salary ) {
      this.address = address;
   }
   }