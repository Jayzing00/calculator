package ch.bbw._CCWM;

/**
 * Calculator
 * @author Jay
 * @version 1.0.0
 */

public class Calculator {

	public int summe(int summand1, int summand2) throws java.lang.ArithmeticException{

		long summe = (long) summand1 + (long) summand2;
		if (summe > Integer.MAX_VALUE) {
			throw new ArithmeticException("Summe ist grösser als Integer.MAX_VALUE");
		}else if (summe < Integer.MIN_VALUE) {
			throw new ArithmeticException("Summe ist kleiner als Integer.MIN_VALUE");
		} else {
			return summand1 + summand2;
		}

	}
	
	public int differenz(int value1, int value2) {

		return value1 - value2;

	}

	public int division(int value1, int value2) {

		return value1 / value2;

	}
	
}
