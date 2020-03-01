package com.jiker.keju;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateMoreThan8KmTest {
	CalculateStrategy calculateStrategy;
	@Test
	public void test_moreThan_8Km_no_time() {
		calculateStrategy=new CalculateMoreThan8Km(9,0);
		assertEquals(12, calculateStrategy.calculate(),0.0001);
	}
	@Test
	public void test_moreThan_8Km_time() {
		calculateStrategy=new CalculateMoreThan8Km(9,3);
		assertEquals(12.75, calculateStrategy.calculate(),0.0001);
	}
}
