package com.ruks.core;

public class Division {

	private int dividend;

	public Division() {
		this.dividend = 0;
		System.out.println("Division: Constructor result is = "+ this.dividend);
	}

	public void divideTwoNumber(int x, int y) {
		this.dividend = x / y;
		System.out.println("Division: divideTwoNumber result is = "+ this.dividend);
	}

	public int getDivideresult() {
		System.out.println("Division -> getDivideresult: result is = "+ this.dividend);
		return this.dividend;
	}
}
