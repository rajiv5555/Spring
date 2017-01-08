/**
 * 
 */
package Day1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Raji
 *
 */
@Configuration
public class Appconfig {
	int count=0;
	//if you will not give name then by default it will be creating bean by type
	@Bean(name="oldshoe")
	//@Scope("prototype")
	Shoe getBata(){
		System.out.println("inside bata bean");
		return new Bata();
	}
	
	/*@Bean(name="newshoe")
	@Scope("prototype")
	Shoe getNewBata(){
		System.out.println("inside new bata bean");
		return new Bata();
	}*/
	
	@Bean(name="ssr")
	@Scope("prototype")
	shoeshowroom getshowroom(){
		System.out.println("creating bean shoeshowroom");
		return new shoeshowroom();
	}
	
	@Bean
	@Qualifier("newshoearr")
	@Scope("prototype")
	Shoe[] getArrayofBata(){
		Shoe s[]=new Bata[10];
		for(int i=0;i<s.length;i++){
			s[i]=new Bata(this.count++);
		}
		return s;
	}

}
