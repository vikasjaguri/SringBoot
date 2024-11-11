package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext c;
	public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
    	c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	EmpDao cd = c.getBean("EmpDao",EmpDao.class);
    	
    	// To insert data
//    	Employee c1 = new Employee();
//    	c1.setEid(781);
//    	c1.setEname("Parita");
//    	c1.setDname("Receptionist");
//    	int r1 = cd.insert(c1);    	
//    	System.out.println("Record inserted" +r1);
    	
    	// To edit data
//        Employee employee = new Employee();
//        employee.setEid(781); // Assuming employee with ID 101 exists
//        employee.setEname("Parita Tarwani"); // New name
//        employee.setDname("Employee"); // New department
//        int r2 = cd.edit(employee);
//        System.out.println("Records updated: " + r2);
        
    	// To delete data
//        Employee c3 = new Employee();
//        employee.setEid(781); // Assuming employee with ID 101 exists
//        employee.setEname("Parita Tarwani"); // New name
//        employee.setDname("Employee"); // New department
//        int r3 = cd.delete(c3);
//        System.out.println("Records updated: " + r3);

    	//Fetch data of a single employee by ID
    	Employee em = cd.getEmployee(214);
    	System.out.println(em);
    	
    	//Fetching all employees from the database
    	List<Employee> employees = cd.getAllEmp();
    	for (Employee em1 : employees) {
    		System.out.println(em1);
    	}
        }
}
