package com.learn;

public class CheckRectangle {
	private int length = 0;
	private int breadth = 0;

	public CheckRectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public boolean isSquare() {
		if (length == breadth) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		CheckRectangle cr = new CheckRectangle(10, 20);

		if (cr.isSquare()) {
			System.out.println("this is square: length = " + cr.length + " X breadth = " + cr.breadth);
		} else {
			System.out.println("this is square: length = " + cr.length + " X breadth = " + cr.breadth);
		}
	}

}
