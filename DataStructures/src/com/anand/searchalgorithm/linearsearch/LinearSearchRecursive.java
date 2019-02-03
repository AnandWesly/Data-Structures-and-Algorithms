package com.anand.searchalgorithm.linearsearch;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 5, 4, 6, 7 };
		System.out.println("10 Not found.." + linearSearch(a, 0, 10));
		System.out.println("5 found at:" + linearSearch(a, 0, 5));
		System.out.println("3 found at:" + linearSearch(a, 0, 3));
		System.out.println("4 found at:" + linearSearch(a, 0, 4));

	}

	public static int linearSearch(int[] a, int i, int x) {
		if (i > a.length - 1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			return linearSearch(a, i + 1, x);
		}
	}

}
