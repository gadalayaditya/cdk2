//public class Employee implements IEmployee{  
public class Employee{  
private int id;  
private String name;  
  
public Employee() 
{
    System.out.println("def cons");
}  

public Employee(int id) 
{
    this.id = id;
    System.out.println("Employee(int id)");
}  
  
public Employee(String name) 
{  
    this.name = name;
    System.out.println("Employee(String str)");
}  
  
public Employee(int id, String name) {  
    this.id = id;  
    this.name = name;  
    System.out.println("Employee(int id, String name)");
} 
  
public Employee(String name,int id) {  
    this.id = id;  
    this.name = name;  
    System.out.println("Check Employee(String name,int id)");
} 

public void show(){  
    System.out.println(id+" "+name);  
}  
  
}
