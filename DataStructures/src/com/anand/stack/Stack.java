package com.anand.stack;

public class Stack {
	private int maxsize;
	private long[] stackArray;
	private int top = -1;

	public Stack(int size) {
		this.maxsize = size;
		stackArray = new long[maxsize];
	}

	public void push(long data) {
		if (isFull()) {
			return;
		}
		top++;
		stackArray[top] = data;
	}

	public long pop() {
		if (isEmpty()) {
			return 0;
		}
		long out = stackArray[top];
		top--;
		return out;
	}

	public long peek() {
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
