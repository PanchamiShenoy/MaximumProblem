package com.max;

public class MaximumTest {
	private Integer x, y, z;

	MaximumTest(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void findMaximum() {
		Integer max = x;
		if (y.compareTo(max) > 0) {

			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}

		System.out.println("Maximum of " + x + "," + y + " and " + z + " is =" + max);

	}

	public static void main(String[] args) {
		Integer x1 = 100, y1 = 200, z1 = 300;
		MaximumTest t1 = new MaximumTest(x1, y1, z1);
		t1.findMaximum();
		MaximumTest t2 = new MaximumTest(y1, z1, x1);
		t2.findMaximum();
		MaximumTest t3 = new MaximumTest(z1, x1, y1);
		t3.findMaximum();

	}

}
