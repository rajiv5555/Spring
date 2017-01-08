/**
 * 
 */
package Day1;

/**
 * @author Raji
 *
 */
public class Puma implements Shoe {
	int price;

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

	@Override
	public int getPrice() {
		
		return this.price;
	}

}
