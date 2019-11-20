package basics.tutorial.playground;

public class ControlFlow {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		// if statement
		if(a) {
			System.out.println("I will get printed if a is true.");
		}

		// if else statement
		if(b) {
			System.out.println("I will get printed if b is true.");
		} else {
			System.out.println("I will get printed if b is false.");
		}
		
		// if else if ladder
		if(b) {
			System.out.println("I will get printed if b is true.");
		} else if(a && b) {
			System.out.println("I will get printed if a and b are both true.");
		} else if (! a || b) {
			System.out.println("I will get printed if a is false or b is true.");
		} else {
			System.out.println("I will get printed if none of the above gets printed");
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("...");
		
		String[] alphabet = {"a", "b", "c", "d", "d", "e"};
		for(int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + ", ");
		}
		System.out.println("...");
		
		int j = 1;
		while(j < 10) {
			System.out.println("j = " + j);
			j *= 2;
		}
		
		do {
			System.out.println("I get printed at least once");
		} while(false);
		
		while(j < 100) {
			System.out.println("j = " + j);
			if(j > 30) {
				break;
			}
			j *= 2;
		}
		
		while(j < 40) {
			j += 1;
			if(j % 2 == 1) {
				continue;
			}
			System.out.println("j = " + j);
		}


	}

}
