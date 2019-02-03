package com.anand.stack;

public class CharStack {
	private int maxsize;
	private char[] stackArray;
	private int top = -1;

	public CharStack(int size) {
		this.maxsize = size;
		stackArray = new char[maxsize];
	}

	public void push(char data) {
		if (isFull()) {
			return;
		}
		top++;
		stackArray[top] = data;
	}

	public char pop() {
		if (isEmpty()) {
			return 'n';
		}
		char out = stackArray[top];
		top--;
		return out;
	}

	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == maxsize) {
			return true;
		}
		return false;
	}

}
