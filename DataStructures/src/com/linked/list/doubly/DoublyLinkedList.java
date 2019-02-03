package com.linked.list.doubly;

public class DoublyLinkedList {
	private Node head;
	private Node last;

	public boolean isEmpty() {
		return head == null;
	}

	public Node insertFirst(int data) {
		Node newNode = new Node();
		if (head == null) {
			head = newNode;
			head.data = data;
			head.prevNode = null;
			head.nextNode = null;
		} else {
			newNode.data = data;
			newNode.prevNode = null;
			newNode.nextNode = head;
			head.prevNode = newNode;
			head = newNode;
		}
		last = head;
		return head;
	}

	public Node insertLast(int data) {
		Node newNode = new Node();
		if (head == null) {
			newNode.data = data;
			newNode.nextNode = null;
			newNode.prevNode = null;
			head = newNode;
		} else {
			Node temp = head;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			newNode.data = data;
			newNode.nextNode = null;
			temp.nextNode = newNode;
			newNode.prevNode = temp;
		}
		last = newNode;
		return newNode;
	}

	public void deleteFirst() {
		if (!isEmpty()) {
			if (head.nextNode == null) {
				head = null;
				last = null;
			} else {
				head = head.nextNode;
				head.prevNode = null;
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
				last = prev;
			}
		}
	}

	public void insertAfterNode(Node afterNode, int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (afterNode.nextNode == null) {// If the afterNode is last
			afterNode.nextNode = newNode;
			newNode.prevNode = afterNode;
			newNode.nextNode = null;
		} else {// AfterNode is in between other Nodes.
			newNode.nextNode = afterNode.nextNode;
			afterNode.nextNode.prevNode = newNode;
			afterNode.nextNode = newNode;
			newNode.prevNode = afterNode;
		}
		if (newNode.nextNode == null) {
			last = newNode;
		}
	}

	public void insertBeforeNode(Node beforeNode, int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (beforeNode == head) {// If the before is first
			beforeNode.prevNode = newNode;
			newNode.prevNode = null;
			newNode.nextNode = beforeNode;
			head = newNode;
		} else {// before node is in between other Nodes.
			beforeNode.prevNode.nextNode = newNode;
			newNode.prevNode = beforeNode.prevNode;
			beforeNode.prevNode = newNode;
			newNode.nextNode = beforeNode;
		}
	}

	public void printLinkedNodesForward() {
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

	public void printLinkedNodesBackward() {
		if (!isEmpty()) {
			Node temp = last;
			System.out.println("-----PRINT-----");
			while (temp != null) {
				System.out.println("Node data-->" + temp.data);
				temp = temp.prevNode;
			}
			System.out.println("-----ENDS-----");
		}
	}
}
