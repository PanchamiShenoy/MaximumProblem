package com.max;

public class MaximumTest {
	Integer x1, y1, z1;
	Float x2, y2, z2;

	public MaximumTest(Integer x1, Integer y1, Integer z1) {
		this.x1 = x1;
		this.y1 = y1;
		this.z1 = z1;
	}

	public MaximumTest(Float x2, Float y2, Float z2) {
		this.x2 = x2;
		this.y2 = y2;
		this.z2 = z2;
	}

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

	public static void main(String[] args) {
		Float x1 = 100.25f, y1 = 200.99f, z1 = 300.98f;
		MaximumTest t1 = new MaximumTest(x1, y1, z1);
		t1.findMaximum(x1, y1, z1);
		MaximumTest t2 = new MaximumTest(y1, z1, x1);
		t2.findMaximum(y1, z1, x1);
		MaximumTest t3 = new MaximumTest(z1, x1, y1);
		t3.findMaximum(z1, x1, y1);

	}

}
