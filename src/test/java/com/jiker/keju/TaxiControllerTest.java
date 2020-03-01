package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxiControllerTest {
	TaxiController controller=new TaxiController();
	@Test
	public void test() {
		assertEquals(new CalculateWithin2Km(1,3).calculate(), controller.calculate(1,3),0.0001);
		assertEquals(new CalculateWithin8Km(4,3).calculate(), controller.calculate(4,3),0.0001);
		assertEquals(new CalculateMoreThan8Km(9,3).calculate(), controller.calculate(9,3),0.0001);
	}
}
