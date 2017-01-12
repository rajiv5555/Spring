/**
 * 
 */
package Day2;

/**
 * @author M1027962
 *
 */
public class Employee {
	
	private String name;
	
	private int salary;
	
	private String designation;
	
	public Employee(){}

	public Employee(String name, int salary, String designation) {
		super();
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public String getName() {
		System.out.println("Name:"+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		System.out.println("salary:"+salary);
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}

	
}
