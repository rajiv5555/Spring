/**
 * 
 */
package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Raji
 *
 */
public class AnnShoe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
/*   // Shoe s=context.getBean(Bata.class);
    Shoe s1=(Shoe) context.getBean("newshoe");// we are creating bean by name like this
    s1.makeshoecomfortable();
    Shoe s2=(Shoe) context.getBean("newshoe");// only one object are getting created bcoz by default its singleton
    //if you want two create two object you need to write @scope("prototype") in the appconfig
    s2.makeshoecomfortable();
    s1.setPrice(100);
    s2.setPrice(200);
    System.out.println(s1.getPrice());
    System.out.println(s2.getPrice());
    //by using autowired Showroom class 
*/    
    //second phase
    System.out.println("====Auto wired concept=====");
    shoeshowroom s=(shoeshowroom) context.getBean("ssr");
    //autowire by type comment  one show bean from appconfig otherwise it will give error
    //s.s1.makeshoecomfortable();
    //Autowire by name
    //s.s3.lookshoegood();
    
    System.out.println("=== array of shoe and parent child protype and singleton ====");
    for(int i=0;i<10;i++){
    	s.s2[i].lookshoegood();
    	System.out.println(s.s2[i].getPrice());
    }
    
    shoeshowroom s1=(shoeshowroom) context.getBean("ssr");
    for(int i=0;i<10;i++){
    	s1.s2[i].lookshoegood();
    	System.out.println(s1.s2[i].getPrice());
    }
	}

}
