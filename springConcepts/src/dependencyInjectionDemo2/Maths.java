package dependencyInjectionDemo2;
//Inversion of Control
public class Maths {

	Addition addition;
	
	public void setAdditionField(Addition addition1) {
		this.addition = addition1;
	}
	
	public void addSomething(int number) {
		addition.add(number);
	}
	
	/*In this case we are receiving the addition object of type
	 * Addition class through a setter method. This removes the dependency
	 * between Maths class and Addition class*/
	
	/*Now we have control over which addition class implementation
	 * to use while instantiating Maths class*/
}
	
	

