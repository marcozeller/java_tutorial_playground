package basics.tutorial.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Rational implements Comparable<Rational>{
	int numerator;
	int denominator;
	
	Rational(int numerator, int denominator){
	this.numerator = numerator;
	this.denominator = denominator;
	}
	
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}

	@Override
	public int compareTo(Rational o) {
		double val_this = ((double) this.numerator) / this.denominator;
		double val_o = ((double) o.numerator) / o.denominator;
		if(val_this == val_o) {
			return 0;
		} else if(val_this > val_o){
			return 1;
		} else {
			return -1;
		}
	}
	
}

public class InterfacesAdvanced {

	public static void main(String[] args) {
		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(1, 3);
		Rational r3 = new Rational(1, 4);
		Rational r4 = new Rational(1, 5);
		
		// save rationales in list in some random order
        List<Rational> rationals = new ArrayList<Rational>();
        rationals.add(r1);
        rationals.add(r3);
        rationals.add(r4);
        rationals.add(r2);

		// sort the list
        Collections.sort(rationals);

		// print the list
		for(Rational r : rationals) {
			System.out.println(r);
		}
	}

}
