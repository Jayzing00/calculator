package ch.bbw._CCWM;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Calculator Test
 * 
 * @author Jay
 * @version 1.0.0
 */

public class CalculatorTest {

	Calculator testee;

	@Before
	public void setup() {
		testee = new Calculator();
	}

	//8 Test mit Summe
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSummeEinPositivEinNegativ() {
		assertTrue(testee.summe(10, -20) == -10);
	}

	@Test
	public void testSummeZweiNegativ() {
		assertTrue(testee.summe(-15, -6) == -21);
	}

	@Test
	public void testSummeNullUndEinPositiv() {
		assertTrue(testee.summe(0, 10) == 10);
	}
	
	@Test
	public void testSummeEquals() {
		assertEquals(5, testee.summe(2, 3));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testSummeMaxValue() {	
		assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE) == -1);
	}
	
	@Test
	public void testSummeMaxValueMinValue() {
		assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}

	@Test(expected=java.lang.ArithmeticException.class)
	public void testSummeEinePositiveEineMaxValueArithmeticException() {
		testee.summe(10, Integer.MAX_VALUE);
	}
	
	//8 Test mit Differenz
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		assertTrue(testee.differenz(25, 10) == 15);
	}
	
	@Test
	public void testDifferenzEinNegativEinPositivIsOk() {
		assertTrue(testee.differenz((-5), 10) == (-15));
	}

	@Test
	public void testDifferenzZweiGleichIsOk() {
		assertTrue(testee.differenz(10, 10) == 0);
	}
	
	@Test
	public void testDifferenzZweiNegativIsOk() {
		assertTrue(testee.differenz(-10, -20) == 10);
	}
	
	@Test
	public void testDifferenzZweiNullIsNull() {
		assertTrue(testee.differenz(0, 0) == 0);
	}
	
	@Test
	public void testDifferenzZweiNegativeArithmeticExceptionNotRaised() throws IndexOutOfBoundsException  {
		testee.differenz((-7), (-7));
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDifferenzEineMinValueEineMaxValueArithmeticException() {
		testee.differenz(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	//8 Test mit Divisio
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionArithmeticException() {
		testee.division(10, 0);
	}

	@Test
	public void testDivisionArithmeticExceptionNotThrown() throws ArithmeticException {
		testee.division(10, 2);
	}

	// Damit ich die Sichtbarkeit bei diesem Test zu "protected" machen kann, müsste
	// die Klasse im selben Paket sein wie die Klasse welche getestet wird.
	@Test
	/* protected */ public void testDivisionZweiPositiveIsOk() {
		assertTrue(testee.division(10, 2) == 5);
	}

	// Damit ich hier die Sichtbarkeit zu private setzen kann müsste ich dp4j
	// benutzen und eine reflection injected. Dies ist aber zu Aufwändig für dieses
	// kleine Projekt.
	// Ausserdem wird empfohlen die private Tests in eine eigene Klasse zu stecken,
	// damit sie die Wiederverwendbarkeit fördern.
	@Test
	/* private */public void testDivisionGleicheZahlenIsOk() {
		assertTrue(testee.division(10, 10) == 1);
	}

}
