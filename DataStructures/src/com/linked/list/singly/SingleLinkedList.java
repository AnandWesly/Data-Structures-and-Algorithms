package com.linked.list.singly;

public class SingleLinkedList {
	private Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
		} else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.nextNode = head;
			head = newNode;
		}
	}

	public void insertLast(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
		} else {
			Node temp = head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			Node newNode = new Node();
			newNode.data = data;
			temp.nextNode = newNode;
		}
	}

	public void deleteFirst() {
		if (!isEmpty()) {
			if (head.nextNode == null) {
				head = null;
			} else {
				head = head.nextNode;
			}
		}
	}

	public void deleteLast() {
		if (!isEmpty()) {
			if (head.nextNode == null) {
				head = null;
			} else {
				Node temp = head;
				Node prev = null;
				while (temp.nextNode != null) {
					prev = temp;
					temp = temp.nextNode;
				}
				prev.nextNode = null;
			}
		}
	}

	public void printLinkedNodes() {
		if (!isEmpty()) {
			Node temp = head;
			System.out.println("-----PRINT-----");
			while (temp != null) {
				System.out.println("Node data-->" + temp.data);
				temp = temp.nextNode;
			}
			System.out.println("-----ENDS-----");
		}
	}
}
