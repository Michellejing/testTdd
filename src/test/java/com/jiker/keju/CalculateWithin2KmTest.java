package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateWithin2KmTest {
	CalculateStrategy calculateStrategy;
	@Test
	public void test_within_2Km_no_time() {
		calculateStrategy=new CalculateWithin2Km(2,0);
		assertEquals(6, calculateStrategy.calculate(),0);
	}
	@Test
	public void test_within_2Km_time() {
		calculateStrategy=new CalculateWithin2Km(2,3);
		assertEquals(6.75, calculateStrategy.calculate(),0);
	}
}
