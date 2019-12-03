package basics.tutorial.playground;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionBasics {

	
	private static void whatdoIprint1() {
		System.out.println("begin of method");
		try {
			System.out.println("try block");
			//System.out.print(1/0);
		} catch(Exception e) {
			System.out.println("catch block");
			//return;
		} finally {
			System.out.println("finally block");
		}
		System.out.println("end of method");
	}
	
	
	private static void whatdoIprint2() {
		try
		{
		    System.out.println("try block");
		    
		    //throw new NumberFormatException();
		    throw new NullPointerException();
		} 
		catch (NullPointerException e) 
		{
		    System.out.println("catch block 1");
		     
		    throw new NullPointerException();
		}
		catch (Exception e) 
		{
		    System.out.println("catch block 2");
		} 
		finally
		{
		    System.out.println("finally block");
		}
	}
	
	// you can add more than one Exception in the declaration with the (,) operator 
	// eg. IndexOutOfBoundsException (never needed because it's an unchecked exception)
	public static void readNonExistingFile() throws FileNotFoundException {
		Scanner s = new Scanner(new File(""));
		// no throws declaration needed here
		//Scanner s = new Scanner(System.in);
		
		
	}
	
	public static void main(String[] args) {
		whatdoIprint1();
		//whatdoIprint2();
		//readNonExistingFile();
	}

}
