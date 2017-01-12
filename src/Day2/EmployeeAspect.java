/**
 * 
 */
package Day2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author M1027962
 *
 */
@Aspect
public class EmployeeAspect {
	//the pointcut expression
	//@Before("execution(public String getName())")
	//@Before("execution(* Day2.Employee.getName())")//this statement will get called before getname
/*	@Before("execution(* Day2.Employee.get*())")
	public void getNameAdvise(){
		System.out.println("hello in getNamebeforeAdvise");
	}

	@After("execution(* Day2.Employee.get*())")// this is getting called before returning value
	public void getNameAfterAdvise(){
		System.out.println("hello in getNameAfterAdvise");
	}
	
	@AfterReturning("execution(* Day2.Employee.get*())")
	public void getNameAfterReturning(){
		System.out.println("hello in getNameAfterReturning ");
	}
	*/
	
	@Around("execution(* Day2.Employee.get*())")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
		System.out.println("====before start=== ");
        Object retVal = pjp.proceed();//joint point invocation
        // stop stopwatch
        System.out.println("===after start=== ");
        return retVal;
    }
	
	@Before(value="execution(* Day2.Employee.set*(..)) && target(bean) && args(salary)")
	public void audit(Object bean,int salary) {
	   Employee e=(Employee) bean;
	   System.out.println("inside audit"+e.getSalary()+"New Salary:"+salary);
	    // ... use code and bean
	}

}
