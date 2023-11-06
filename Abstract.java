package polymorphism;
//You cannot create object of abstract class, you can create reference
//you can use abstract methods in abstract class only,

abstract class Car{
	//Just declaring, defining means {  };
	public abstract void drive();
	public abstract void fly();
	
	public void listen() {
		System.out.println("Listening..");
	}
}
abstract class Audi extends Car{
	//Implementing Abstract method
	//If you don't want to implement all abstract methods, you can make class abstract
	public void drive() {
		System.out.println("Driving.");
	}
}
class WagonR extends Audi{ //Concrete Class

	public void fly() {
		System.out.println("Flying...");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Car obj = new WagonR();//can create object of concrete class
		obj.drive();
		obj.listen();
		obj.fly();

	}

}
