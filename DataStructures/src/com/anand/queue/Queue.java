package com.anand.queue;

public class Queue {

	private int max;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int maxsize) {
		this.max = maxsize;
		this.queueArray = new long[max];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void enqueue(long data) {
		rear++;
		queueArray[rear] = data;
		nItems++;
	}

	public void dequeue() {
		front++;
		nItems--;
		if (front == max) {
			front = 0;
		}
	}

	public void view() {
		if (!isEmpty()) {
			for (int i = front; i <= rear; i++) {
				System.out.print(queueArray[i]);
			}
		}
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == max;
	}

}
