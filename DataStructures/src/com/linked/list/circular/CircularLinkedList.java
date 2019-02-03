package com.linked.list.circular;

public class CircularLinkedList {
	private Node head;
	private Node last;

	public boolean isEmpty() {
		return head == null && last == null;
	}

	public void insertFirst(int data) {
		if (head == null && last == null) {
			head = new Node();
			head.data = data;
			last = head;
			last.nextNode = head;
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.nextNode = head;
			head = newNode;
			last.nextNode = head;
		}
	}

	public void insertLast(int data) {
		if (head == null && last == null) {
			head = new Node();
			head.data = data;
			last = head;
		} else {
			Node temp = last;
			Node newNode = new Node();
			newNode.data = data;
			temp.nextNode = newNode;
			last = newNode;
		}
	}

	public void deleteFirst() {
		if (!isEmpty()) {
			if (head.nextNode == null) {
				head = null;
				last = null;
			} else {
				head = head.nextNode;
				last.nextNode = head;
			}
		}
	}

	public void deleteLast() {
		if (!isEmpty()) {
			if (head.nextNode == null) {
				head = null;
				last = null;
			} else {
				Node temp = head;
				Node prev1 = null;
				while (temp != last) {
					prev1 = temp;
					temp = temp.nextNode;
				}
				prev1.nextNode = head;
				last = prev1;
			}
		}
	}

	public void printLinkedNodes() {
		if (!isEmpty()) {
			Node temp = head;
			System.out.println("-----PRINT-----");

			do {
				System.out.println("Node data-->" + temp.data);
				temp = temp.nextNode;
			} while (temp != null && temp != head);
			System.out.println("-----ENDS-----");
		}
	}
}
