/**
 * This class is to calculate wages for babysitter
 */
package com.src.babysitter.calculator;


public class BabySitterWageCalculator {
	
	private static final int AFTER_MIDNIGHT_RATE = 16;
	private static final int AFTER_BED_RATE = 8;
	private static final int DAY_RATE = 12;
	private static final int MID_NIGHT_TIME = 12;
	private int startTime;
	private int endTime;
	private int bedTime;
	

	public BabySitterWageCalculator(int startTime, int endTime, int bedTime) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.bedTime = bedTime;
	}

	public int calculatePay() {

		int totalPay = 0;
		int hourPay = 0;
		

		for (int currentHour = startTime; currentHour < endTime; currentHour++) {

			if (isTimebeforeBedtime(currentHour)) {
				hourPay = DAY_RATE;
			} else if (isTimeBetweenBedtimeAndMidnight(currentHour)) {
				hourPay = AFTER_BED_RATE;
			} else {
				hourPay = AFTER_MIDNIGHT_RATE;
			}

			totalPay += hourPay;
			hourPay = 0;
		}
		
		return totalPay;
	}

	private boolean isTimeBetweenBedtimeAndMidnight(int hour) {
		return hour >= bedTime && hour < MID_NIGHT_TIME;
	}

	private boolean isTimebeforeBedtime(int hour) {
		return hour < bedTime;
	}


}
