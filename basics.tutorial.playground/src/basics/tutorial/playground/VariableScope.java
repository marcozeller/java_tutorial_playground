package basics.tutorial.playground;

public class VariableScope {

	static String x = "I am a (global) class member / variable"; // class member variable
	
	public static void someMethod() {
	    System.out.println(x); // here we can access class member but not local variables of other functions

		String x = "I am a local variable in the someMethod function"; // a function defines a new scope which overrides the old one

	    System.out.println(x);
	}
	
	
	public static void main(String[] args) {

	System.out.println(x);

	String x = "I am a local variable in the main function"; // define local variable

	System.out.println(x);

	System.out.println(VariableScope.x); // the class member variable must be explicitly stated
	
	someMethod();

	}

}
