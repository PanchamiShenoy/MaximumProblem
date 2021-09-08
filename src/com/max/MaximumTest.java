package com.max;

public class MaximumTest {

	/*
	 * generic method to find max 
	 */
	public <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.printf("\nMax of" + x + " " + y + " " + z + "  is" + max);
		return max;

	}

	public static void main(String[] args) {
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";
		MaximumTest t1 = new MaximumTest();
		t1.findMaximum(s1, s2, s3);
		MaximumTest t2 = new MaximumTest();
		t2.findMaximum(s2, s3, s1);
		MaximumTest t3 = new MaximumTest();
		t3.findMaximum(s3, s1, s2);
	}

}
