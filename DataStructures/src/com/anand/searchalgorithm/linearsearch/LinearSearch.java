package com.anand.searchalgorithm.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 5, 4, 6, 7 };
		System.out.println("10 Not found.." + linearSearch(a, 10));
		System.out.println("5 found at:" + linearSearch(a, 5));
		System.out.println("3 found at:" + linearSearch(a, 3));
		System.out.println("4 found at:" + linearSearch(a, 4));

	}

	public static int linearSearch(int[] a, int x) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
