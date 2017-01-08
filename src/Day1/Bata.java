/**
 * 
 */
package Day1;

/**
 * @author Raji
 *
 */
public class Bata implements Shoe{
	
	int price;
	
	

	public Bata() {
		
	}

	public Bata(int price) {
		this.price = price;
	}

	@Override
	public void makeshoecomfortable() {
		System.out.println("inside makeshoecomfortable");
		
	}

	@Override
	public void lookshoegood() {
		System.out.println("inside lookshoegood");
		
	}

	@Override
	public void setPrice(int price) {
		this.price=price;
		
	}
	
	public int getPrice(){
		return this.price;
	}

}
