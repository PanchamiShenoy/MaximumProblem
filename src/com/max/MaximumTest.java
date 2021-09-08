package com.max;

import java.util.Arrays;

public class MaximumTest<T extends Comparable<T>> {
	public T x, y, z, max;

	public MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/*
	 * generic method to find max
	 */
	public <T extends Comparable<T>> void findMaximum(T... values) {
		Arrays.sort(values);
		T max = values[values.length - 1];
		printMax(max);
	}

	public <T> void printMax(T max) {
		System.out.println("Max element is" + max);
	}

	public static void main(String[] args) {
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";
		MaximumTest t1 = new MaximumTest(s1, s2, s3);
		t1.findMaximum(s1, s2, s3);
		Integer num1 = 100, num2 = 200, num3 = 300, num4 = 900, num5 = 700;
		MaximumTest t2 = new MaximumTest(num1, num2, num3);
		t2.findMaximum(num1, num2, num3, num4, num5);
		Float f1 = 999.9f, f2 = 999.8f, f3 = 999.79f, f4 = 999.444f;
		MaximumTest t3 = new MaximumTest(f1, f2, f3);
		t3.findMaximum(f1, f2, f3, f4);
	}

}
