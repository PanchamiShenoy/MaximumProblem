package com.max;

public class MaximumTest<T extends Comparable<T>> {
	public T x, y, z;

	public MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void findMax() {
		T max = MaximumTest.findMaximum(x, y, z);
	}

	/*
	 * generic method to find max
	 */
	public static <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("\nMaximum of " + x + "," + y + " and " + z + " is " + max);
		return max;

	}

	public static void main(String[] args) {
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";
		MaximumTest t1 = new MaximumTest(s1, s2, s3);
		t1.findMax();
		Integer num1 = 100, num2 = 200, num3 = 300;
		MaximumTest t2 = new MaximumTest(num1, num2, num3);
		t2.findMax();
		Float f1 = 999.9f, f2 = 999.8f, f3 = 999.79f;
		MaximumTest t3 = new MaximumTest(f1, f2, f3);
		t3.findMax();
	}

}
