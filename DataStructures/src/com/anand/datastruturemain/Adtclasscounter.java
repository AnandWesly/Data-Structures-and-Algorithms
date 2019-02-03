package com.anand.datastruturemain;

import com.anand.stack.CharStack;

public class Adtclasscounter {
	int counter;

	public static void main(String[] args) {

		String test = "ANANDWESLY";
		char[] charArray = test.toCharArray();
		CharStack stck = new CharStack(test.length());
		int i = 0;
		while (i < test.length()) {
			stck.push(charArray[i]);
			i++;
		}

		while (!stck.isEmpty()) {
			System.out.print(stck.pop());
		}

	}

	Adtclasscounter(String str) {

	}

	public void increment() {
		counter = +counter;
	}

	public int getCurrentValue() {
		return counter;

	}

	public String ToString() {
		return String.valueOf(counter);

	}

}
