package com.ruks.core;

public class Multiplication {
	private int product;

	public Multiplication() {
		this.product = 0;
		System.out.println("Multiplication: Constructor result is = "+ this.product);
	}

	public void multiplyTwoNumber(int x, int y) {
		this.product = x * y;
		System.out.println("Multiplication: multiplyTwoNumber result is = "+ this.product);
	}

	public int getMultiplyresult() {
		System.out.println("Multiplication -> getMultiplyresult: result is = "+ this.product);
		return this.product;
	}
}
