package com.ruks.core;

public class Addition {
	private int sum;

	public Addition() {
		this.sum = 0;
		System.out.println("Addition: constructor result is = "+ this.sum);
	}

	public void addTwoNumber(int x, int y) {
		this.sum = x + y;
		System.out.println("Addition: addTwoNumber result is = "+ this.sum);
	}

	public int getAddresult() {
		System.out.println("Addition -> getAddresult: result is = "+ this.sum);
		return this.sum;
	}
}
