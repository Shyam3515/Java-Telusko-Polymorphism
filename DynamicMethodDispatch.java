//To implement Run-time Polymorphism, let use another examlpe and we do that using dynamic method dispatch...

//Irrespective of what type of object you have or what type of variable you create(it's type A or something)
// it's all depends upon what object you have, and it is only possible when you have inheritance... 
package polymorphism;

class Computer {
	public void show() {
		System.out.println("In Computer...");
	}
}

class Laptop extends Computer {
	public void show() {
		System.out.println("In Laptop...");
	}
}

class AdvLaptop extends Computer {
	public void show() {
		System.out.println("In Advanced Laptop...");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.show();
		// Creating Reference of Computer for Object Of Laptop...Laptop is child of Computer...
		// Type of Obj is Computer(parent) and implementation of Obj is Laptop(Child)...
		// So we are referring this as an object, which is a computer(Super Class), but
		// technically its a laptop(Sub Classs).

		// Differet objects will have different behaviour, remember run time polymorphism
		obj = new Laptop();
		obj.show();
		// this obj.show() behaves differently for different objects...Polymorphism...
		obj = new AdvLaptop();
		obj.show();

		//This whole process is called Dynamic method dispatch, bcz which method will get call we are not sure..
	}

}
