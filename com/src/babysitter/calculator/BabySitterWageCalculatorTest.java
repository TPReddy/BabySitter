package com.src.babysitter.calculator;

import static org.junit.Assert.*;


import org.junit.Test;

public class BabySitterWageCalculatorTest {


	@Test
	public void calculatePayShouldReturn12PerHourUntilBedtime() {
		BabySitterWageCalculator calc = new BabySitterWageCalculator(6,7,9);
		assertEquals(12, calc.calculatePay());
	}

	@Test
	public void calculatePayShouldReturn8PerHourBetweenBedAndMidnight() {
		BabySitterWageCalculator calc = new BabySitterWageCalculator(8,10,8);
		assertEquals(16, calc.calculatePay());
	}

	@Test
	public void calculatePayShouldGetReturn16PerHourAfterMidnight() {
		BabySitterWageCalculator calc = new BabySitterWageCalculator(12,14,8);
		
		assertEquals(32, calc.calculatePay());
	}
	
	@Test
	public void calculatePayShouldReturnCorrectlyForAllNight() {
		BabySitterWageCalculator calc = new BabySitterWageCalculator(7,17,9);
		assertEquals(128, calc.calculatePay());
	}
	

}
