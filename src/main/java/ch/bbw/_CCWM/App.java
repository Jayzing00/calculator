package ch.bbw._CCWM;

/**
 * App
 * @author Jay
 * @version 1.0.0
 */

public class App 
{
    public static void main( String[] args )
    {
    	 Calculator calc = new Calculator();
         int valueA = 10;
         int valueB = 20;
         
         System.out.println("Console Calculator");
         System.out.println("==================");
         System.out.println();
         
         valueA = 10;
         valueB = 20;
         System.out.println("Summe: " + valueA + " + " + valueB + " = " + calc.summe(valueA, valueB));
         System.out.println("Differenz: " + valueB + " - " + valueA + " = " + calc.differenz(valueB, valueA));
         System.out.println("Division: " + valueB + " / " + valueA + " = " + calc.division(valueB, valueA));
         System.out.println("Multiplikation: " + valueA + " * " + valueB + " = " + calc.multiplikation(valueB, valueA));
    }
}
