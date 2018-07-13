/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springhibernate;

/**
 *
 * @author ADMIN
 */
import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmployeeDao dao=(EmployeeDao)factory.getBean("d");
	
	Employee e=new Employee();
	e.setId(149);
	e.setName("Kishore");
	e.setSalary(80000);
	
	//dao.saveEmployee(e);
	//dao.updateEmployee(e);
        
        List<Employee> empl = dao.queryEmployee();
        
        for(Employee etmp:empl)
        {
            System.out.println(etmp.getName()+" "+etmp.getSalary());
        }
}
}
