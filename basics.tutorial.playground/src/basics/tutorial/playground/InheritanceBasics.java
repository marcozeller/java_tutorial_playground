package basics.tutorial.playground;

class A {
	public void printSomething() {
		System.out.println("Hello World!");
	}

	public void identify() {
		System.out.println("A");
	}

}

class B extends A {
	// If B extends A it inherits all functions of class A

	// However it may redefine some of those methods
	public void identify() {
		System.out.println("B");
	}

	public void whatDoIExtend() {
		System.out.print("I extend class ");
		// You may use super to refer call otherwise redefined methods
	super.identify();
	}

}

public class InheritanceBasics {

	public static void main(String[] args) {
		A objectOfClassA = new A();
		objectOfClassA.printSomething();
		System.out.print("I am an Object of class ");
		objectOfClassA.identify();

		System.out.println("-----------------------------------------------");

		A objectOfClassB = new B();
		objectOfClassB.printSomething();
		System.out.print("I am an Object of class ");
		objectOfClassB.identify();
		((B) objectOfClassB).whatDoIExtend();
		System.out.println((int) 3.4);

		System.out.println("-----------------------------------------------");
	}

}
