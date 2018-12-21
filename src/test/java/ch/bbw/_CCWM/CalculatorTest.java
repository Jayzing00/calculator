package ch.bbw._CCWM;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * Calculator Test
 * @author Jay
 * @version 1.0.0
 */

public class CalculatorTest {

	Calculator testee;
	
	@Before
	public void setup() {
		testee = new Calculator();
	}
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testDifferenzZweiPositiveIsOk() {
		assertTrue(testee.differenz(25, 10) == 15);
	}

}
