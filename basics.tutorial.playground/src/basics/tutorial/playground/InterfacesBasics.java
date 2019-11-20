package basics.tutorial.playground;

interface IA {
	abstract public void methodA();
}

interface IB {
	abstract public void methodB();
}

class C implements IA, IB {
	public void methodA() {
		System.out.println("I must implement this method because I implement IA");
	}

	public void methodB() {
		System.out.println("I must implement this method because I implement IB");
	}

}

public class InterfacesBasics {

	public static void main(String[] args) {

		C objectOfTypeC = new C();
		objectOfTypeC.methodA();
		((IA) objectOfTypeC).methodA();
		((IB) objectOfTypeC).methodB();

	}

}