package polymorphism;
//An inner class in Java is defined as a class that is declared inside another class. 
//Inner classes are often used to create helper classes, such as views or adapters that are used by the outer class. 
//Inner classes can also be used to create nested data structures, such as a linked list.
class Alpha{
	public void show() {
		
	}
	class Beta{
		
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Alpha obj = new Alpha();
		//If you want to refer B here U need to use A.B as B belongs to A(inner Class)...
		//If you need obj of B, U need obj of A first
		
		// for non-static methods you need obj to call it...
		Alpha.Beta obj1 = obj.new Beta();
		
		//when inner class is static (static class B)
		//A.B obj = new A.B();
	}

}
