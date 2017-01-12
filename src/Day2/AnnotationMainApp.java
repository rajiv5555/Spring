package Day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMainApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		e.getName();
		e.getSalary();
		e.setSalary(2000);
		System.out.println(e.getDesignation());

	}

}
