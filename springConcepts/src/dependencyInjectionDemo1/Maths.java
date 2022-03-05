package dependencyInjectionDemo1;
//Dependency Injection in spring
public class Maths {

	Addition addition = new Addition();
	
	public void addSomething(int number) {
		addition.add(number);
	}
	
	/*In this example maths class directly depends upon Addition class
	and we have no control on the Addition class while creating obj of
	maths class*/ 
}
