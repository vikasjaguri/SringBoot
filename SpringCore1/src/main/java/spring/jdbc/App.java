package spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    private static ApplicationContext c;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate t = c.getBean("jdbcTemplate", JdbcTemplate.class);

        String q = "insert into employee(eid,ename,salary) values(101,'Ajin',55000)";
        int result = t.update(q);
        
        System.out.println("Record inserted: " + result);
    }
}
