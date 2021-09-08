package com.max;

public class MaximumTest {

	/*
	 * method to find max of integer
	 */
	public Integer findMaximum(Integer x1, Integer y1, Integer z1) {
		Integer max = x1;
		if (y1.compareTo(max) > 0) {
			max = y1;
		}
		if (z1.compareTo(max) > 0) {
			max = z1;
		}
		System.out.printf("\nMax of" + x1 + " " + y1 + " " + z1 + "  is" + max);
		return max;
	}

	/*
	 * method to find max of float
	 */
	public Float findMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.printf("\nMax of" + x + " " + y + " " + z + "  is" + max);
		return max;

	}

	/*
	 * method to find max od string
	 */
	public String findMaximum(String x3, String y3, String z3) {
		String max = x3;
		if (y3.compareTo(max) > 0) {
			max = y3;
		}
		if (z3.compareTo(max) > 0) {
			max = z3;
		}
		System.out.printf("\nMax of" + x3 + " " + y3 + " " + z3 + "  is" + max);
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


