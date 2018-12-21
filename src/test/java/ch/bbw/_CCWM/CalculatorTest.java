package ch.bbw._CCWM;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Calculator Test
 * @author Jay
 * @version 1.0.0
 */

public class CalculatorTest {

	Calculator testee;
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

}
