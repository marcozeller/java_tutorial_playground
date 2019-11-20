package basics.tutorial.playground;

public class DataTypes {
	/*
	 * In this class we explain all the boiler-plate code needed for a simple Java
	 * program and demonstrate the basic datatypes available in Java and do some
	 * simple manipulations on them.
	 */

	/*
	 * Source code is not only written for a computer. The reason we write programs
	 * in a high-level language rather than in lets say assembler is that humans can
	 * understand and reason about what is going on. However the code must be
	 * written in a way the computer can "understand" and execute it. For this
	 * reason source code can often be a bit cryptic to a human who does not know
	 * what the code is supposed to do. In Java there are two ways to write a
	 * comment:
	 *
	 * 1. write "//" (without the "") and everything following on the same line will
	 * be ignored by the computer. This type of comment is called a single-line
	 * comment.
	 * 
	 * 2. write "/*" (without the "") to start a comment and write "* /" (without
	 * the "" and with no space between the two characters!) to end the comment.
	 * This type of comment is called multi-line comment since it allows the comment
	 * to span over several lines. An example of such a multi-line comment is the
	 * one you are reading right now. It is common in Java to add additional
	 * asterisks on every line of the comment to clearly indicate that this is still
	 * a comment. Those additional indicators are not needed tough and a program
	 * runs just fine without them.
	 * 
	 * There are very different opinions on how many comments a program needs. It
	 * takes a lot of experience to find right amount and it might depend very much
	 * on the project one is working on. The only universal guideline is that
	 * comments should describe what the program is supposed to do on a higher
	 * level. Further can comments be used to set part of the code as inactive
	 * without deleting it and to describe the status of work in progress. You will
	 * do yourself a favor by writing good, meaningful comments if you later have to
	 * change something in your program. You might understand it now but in two
	 * weeks...
	 */

	// Single-line comment

	/*
	 * Multi-line comment ...
	 *
	 * ... still multi-line comment
	 */

	public static void main(String[] args) {
		/*
		 * This is the main function. Every executable Java program must contain exactly
		 * one. Below there is a description what all the words above mean. You may
		 * ignore them for now and just remember to put exactly the same line when
		 * writing a function. "public" means that this function can be called from
		 * outside the class. "static" means that there is exactly one main function for
		 * all objects of this class. "void" means that the function does not return
		 * anything. and finally the "String[] args" describes that the function can be
		 * called with an array of strings as argument. Further we use have to use {} to
		 * mark the block of code which belongs to the main function.
		 */

		// The following line prints Hello World to the screen when executed
		System.out.println("Hello World");

		System.out.println("\n------------------------------\n");

		//////////////////////////////////////////////////////////////////////////////////////////////
		// Basic datentypes
		//////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * There are two kinds of datatypes available in Java to represent numerical
		 * values. One kind to represent integers and the other kind to represent real
		 * numbers. The reason for two existing datatypes to represent numbers has to do
		 * with the underlying hardware. In a computer we only have a limited (finite)
		 * amount of space to store each number. There exists however an infinite number
		 * of integer values, thus the range of numbers we can represent is limited. For
		 * real numbers there is the additional problem of representing a potentially
		 * infinite number of digits. Strictly speaking we therefore only ever store
		 * rational numbers in a computer.
		 */

		/*
		 * TODO: play around with different values for m and n observe what happens
		 */
		int m; // variable declaration
		m = 3; // variable assignment
		m = 1; // a variable may be reassignment several times
		m = 3; // it always keeps the last value which have been assigned
		// However a variable cannot be declared more than once
		// TODO: uncomment the line below to get a compile error
		// int m = 3;

		int n = 2; // variable declaration and assignment is often combined

		// Every variable needs to have a type which it gets when declared.
		// This type is given by the programmer and cannot be changed later.

		/*
		 * There are also the datatypes byte, short and long, which use fewer (byte,
		 * short) or more (long) bits in memory and have thus a smaller or bigger range
		 * than int. Nowadays the use of short is not encouraged but long might be
		 * useful in some situations.
		 */
		// byte j = 3;
		// short k = 3;
		// long l = 3;

		// double stands for double-precision floating point value

		/*
		 * TODO: play around with different values for x and y observe what happens
		 */
		double x = 3;
		double y = 2;

		/*
		 * there is also the datatype float, which uses fewer bits in memory but is less
		 * precise than double nowadays there is almost never a reason to use float
		 * instead of double and it is best to avoid them.
		 */
		// float z = 3;
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Simple arithmetic
		//////////////////////////////////////////////////////////////////////////////////////////////
		System.out.print("m = ");
		System.out.println(m);

		System.out.print("n = ");
		System.out.println(n);

		// addition
		System.out.print("m + n = ");
		System.out.println(m + n);

		// subtraction
		System.out.print("m - n = ");
		System.out.println(m - n);

		// multiplication
		System.out.print("m * n = ");
		System.out.println(m * n);

		// division
		// in integer division any fractional part of the result will get truncated (not
		// rounded!) => 3/2 = 1
		System.out.print("m / n = ");
		System.out.println(m / n);

		// modulo operation = rest after division
		System.out.print("m % n = ");
		System.out.println(m % n);

		// integer division by 0 is not allowed in Java and leads to a runtime exception
		// TODO: uncomment the following line to get runtime exception
		// System.out.println(m / 0);

		// the same goes for integer modulo
		// TODO: uncomment the following line to get runtime exception
		// System.out.println(m % 0);

		System.out.println("\n------------------------------\n");

		System.out.print("x = ");
		System.out.println(x);

		System.out.print("y = ");
		System.out.println(y);

		// addition
		System.out.print("x + y = ");
		System.out.println(x + y);

		// subtraction
		System.out.print("x - y = ");
		System.out.println(x - y);

		// multiplication
		System.out.print("x * y = ");
		System.out.println(x * y);

		// division
		// in floating point division the result will have a fractional part => 3.0/2.0
		// = 1.5
		System.out.print("x / y = ");
		System.out.println(x / y);

		// modulo operation = rest after division
		System.out.print("x % y = ");
		System.out.println(x % y);

		// floating point division by 0.0 leads to + or - infinity
		System.out.print("1.0 / 0.0 = ");
		System.out.println(1.0 / 0.0);

		System.out.print("-1.0 / 0.0 = ");
		System.out.println(-1.0 / 0.0);

		// the following examples lead to the result NaN which reads "not a number"
		System.out.print("0.0 / 0.0 = ");
		System.out.println(0.0 / 0.0);

		System.out.print("1.0 % 0.0 = ");
		System.out.println(1.0 % 0.0);

		System.out.print("-1.0 % 0.0 = ");
		System.out.println(-1.0 % 0.0);

		System.out.print("0.0 % 0.0 = ");
		System.out.println(0.0 % 0.0);

		// limited precision of floating point number might lead to unexpected behavior
		System.out.print("1000000.0 + 0.0000000001 = ");
		System.out.println(1000000.0 + 0.0000000001);

		System.out.print("1000000.0 + 0.00000000001 = ");
		System.out.println(1000000.0 + 0.00000000001);

		System.out.println("\n------------------------------\n");

		boolean a = true;
		boolean b = false;

		System.out.print("a = ");
		System.out.println(a);

		System.out.print("b = ");
		System.out.println(b);
		// logical and
		System.out.print("a && b = ");
		System.out.println(a && b);

		// logical or
		System.out.print("a || b = ");
		System.out.println(a || b);

		//////////////////////////////////////////////////////////////////////////////////////////////
		// TODO: short circuit evaluation
		//////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * A boolean expression is only evaluated from left to right until it is clear
		 * what the result is. This can be used to avoid runtime errors by first
		 * checking a condition which would create a runtime error when evaluating the
		 * expression further. This kind of evaluation is called short circuit
		 * evaluation.
		 */
		System.out.print("true || 1 / 0 = ");
		System.out.println(true || 1 / 0 == 42);

		// TODO: uncomment the following line to get runtime exception
		// System.out.println(1 / 0 == 42 || true);

		// Practical application of short circuit evaluation:
		System.out.print("x != 0 && 2/x == 0 evaluates to: ");
		System.out.println(x != 0 && 2 / x == 0);

		//////////////////////////////////////////////////////////////////////////////////////////////
		// TODO: implicit conversion
		//////////////////////////////////////////////////////////////////////////////////////////////

		System.out.print("1 + 5.0 = ");
		System.out.println(1 + 5.0);

		//////////////////////////////////////////////////////////////////////////////////////////////
		// TODO: explicit conversion
		//////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * A popular exam question is if we convert an integer to a double and back if
		 * we always end up with the same number?
		 * 
		 * answer is: yes (for int and doubles but no for int and float)
		 * 
		 * TODO: try out for yourself
		 */
		int p = -2147483647;
		System.out.print("(int) (double) p == p evaluates to: ");
		System.out.println((int) (double) p == p);

		System.out.print("(int) (float) p == p evaluates to: ");
		System.out.println(((int) (float) p) == p);

		//////////////////////////////////////////////////////////////////////////////////////////////
		// TODO: Arrays
		//////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * When we want to store a bunch of data together we can do this in Java by
		 * using arrays.
		 */
		
		int[] d = {0, 1, 2};
		int[] e = new int[3];
		System.out.print("d[0], d[1], d[2] = ");
		System.out.print(d[0]);
		System.out.print(", ");
		System.out.print(d[1]);
		System.out.print(", ");
		System.out.println(d[2]);

	}

}
