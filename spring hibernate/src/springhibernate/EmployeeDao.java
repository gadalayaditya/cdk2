/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this eTemplate file, choose Tools | Templates
 * and open the eTemplate in the editor.
 */
package springhibernate;

/**
 *
 * @author ADMIN
 */
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
HibernateTemplate eTemplate;
public void seteTemplate(HibernateTemplate eTemplate) {
	this.eTemplate = eTemplate;
}

public void saveEmployee(Employee e){
	eTemplate.save(e);
}

public void updateEmployee(Employee e){
	eTemplate.update(e);
}

public void deleteEmployee(Employee e){
	eTemplate.delete(e);
}

public List<Employee> queryEmployee(){
	List<Employee> el = eTemplate.find("FROM Employee");
        return el;
}
}
