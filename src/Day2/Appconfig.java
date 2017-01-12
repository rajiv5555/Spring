package Day2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Appconfig {
	
	@Bean
	public Employee createBean(){
		System.out.println("in normal bean");
		return new Employee("Rajiv",1000,"Engineers");
	}
	
	@Bean
	public EmployeeAspect createAspectBean(){
		System.out.println("in aspect bean");
		return new EmployeeAspect();
	}

}
