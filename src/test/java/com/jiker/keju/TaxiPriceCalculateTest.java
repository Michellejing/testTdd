package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxiPriceCalculateTest {
	TaxiPriceCalculate txCalculate=new TaxiPriceCalculate(10, 0);
	@Test
	public void test_getDistance() {
		assertEquals(0, txCalculate.getDistance(-1));
		assertEquals(3, txCalculate.getDistance(3));
	}
	@Test
	public void test_displayPrice() {
		TaxiController txController=new TaxiController();
		assertEquals("收费13元\n", txCalculate.displayPrice(txController));
	
	}
}
