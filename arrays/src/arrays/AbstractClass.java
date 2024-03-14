package arrays;
abstract class Addition{
	
	abstract void add();
	
	public void sub()
	{
		System.out.println("Subtraction");
	}
}

abstract class ImplementedMethod extends Addition{
	abstract void division();
	public void multipy()
	{
		System.out.println("Multiplication");
	}
}

class Defining extends ImplementedMethod {
	public void add() {
		System.out.println("Addition");
	}
	public void division() {
	System.out.println("Division");
	}
}
  public class AbstractClass {

	public static void main(String[] args) {
		Defining obj1 = new Defining();
		obj1.add();
		obj1.sub();
		obj1.multipy();
		obj1.division();
	}
 }
  