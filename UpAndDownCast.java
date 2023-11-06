package polymorphism;

class A {
	public void show1() {
		System.out.println("In Computer...");
	}
}

class B extends A {
	public void show2() {
		System.out.println("In Laptop...");
	}
}

public class UpAndDownCast {

	public static void main(String[] args) {
		//here the object is b but we are refering it to A.
		//basically we are moving up, means upcasting...
		//parent reference and child object...
		A obj = (A) new B();
		obj.show1();
		
		//Downcasting...
		//here this obj is parent reference, we are downcasting it to child reference.
		B obj1 = (B)obj;
		obj1.show2();

	}

}
