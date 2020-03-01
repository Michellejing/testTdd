package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimingPriceTest {
	TimingPrice timePrice=new TimingPrice(2);
	@Test
	public void test() {
		assertEquals(0.5, timePrice.calculateTimingPrice(),0);
//		assertEquals(1, timePrice.CalculateTimingPrice(),0);
	}
}
