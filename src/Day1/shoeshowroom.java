/**
 * 
 */
package Day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author Raji
 *
 */
public class shoeshowroom {

	//autowiring by type
	//@Autowired
	//Shoe s1;
	
	//Shoe s2;
	
	//autowire by name
	@Autowired
	@Qualifier("newshoe")
	Shoe s3;
}
