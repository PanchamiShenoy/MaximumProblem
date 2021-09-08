package com.max;

public class MaximumTest {
	private Float x, y, z;

	MaximumTest(Float x, Float y, Float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void findMaximum() {
		Float max = x;
		if (y.compareTo(max) > 0) {

			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		System.out.println("Maximum of " + x + "," + y + " and " + z + " is =" + max);

	}

	public static void main(String[] args) {
		Float x1 = 100.25f, y1 = 200.99f, z1 = 300.98f;
		MaximumTest t1 = new MaximumTest(x1, y1, z1);
		t1.findMaximum();
		MaximumTest t2 = new MaximumTest(y1, z1, x1);
		t2.findMaximum();
		MaximumTest t3 = new MaximumTest(z1, x1, y1);
		t3.findMaximum();

	}

}
