import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class Test {  
    //public static void main(String... args) {  
    public static void main(String[] args) {
        System.out.println("main 1");
        //Load XML file
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        
        //ApplicationContext context = 
        //     new ClassPathXmlApplicationContext("applicationContext.xml");
          
        //As shown below any number of beans can be created, in the application
        //at various places
        
        //IEmployee s=(IEmployee)factory.getBean("e",40,"wxyz");
        //System.out.println("main 2");
       Employee s1= (Employee)factory.getBean("e");
        //s.show();
       // System.out.println("main 3");
        s1.show();
          
    }  
}
