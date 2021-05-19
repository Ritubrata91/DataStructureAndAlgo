package com.ritubrata.DSAndAlgo.miscellanious;


public class GCDFinder {



	/**
	 * This method takes two positive integers and finds their gcd using
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public int gcd(final int a, final int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(final String[] args) {
		System.out.println(new GCDFinder().gcd(25, 10)); // should print 5
	}
}
