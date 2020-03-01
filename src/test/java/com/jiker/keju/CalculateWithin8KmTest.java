package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateWithin8KmTest {
	CalculateStrategy calculateStrategy;
	@Test
	public void test_within_8Km_no_time() {
		calculateStrategy=new CalculateWithin8Km(6,0);
		assertEquals(9.2, calculateStrategy.calculate(),0);
	}
	@Test
	public void test_within_8Km_time() {
		calculateStrategy=new CalculateWithin8Km(6,3);
		assertEquals(9.95, calculateStrategy.calculate(),0);
	}
}
