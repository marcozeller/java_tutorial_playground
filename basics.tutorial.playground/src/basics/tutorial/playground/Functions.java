package basics.tutorial.playground;

public class Functions {
	
	public static void tryToChangeX(String x) {
		// call by value
		// a copy of the argument is passed to the function
		// changing this copy has no influence on the variable outside
		// in Java the basis-datatypes (int, double, boolean, String, ...) get passed by value
		System.out.println("Old value of x in tryToChange is " + x);
		x = "2";

		System.out.println("New value of x in tryToChange is " + x);
	}

	public static void main(String[] args) {

		String x = "1";
		System.out.println("Value of x in main is " + x);
		
		tryToChangeX(x);
		System.out.println("Value of x in main after tryToChange is still " + x);

	}

}
