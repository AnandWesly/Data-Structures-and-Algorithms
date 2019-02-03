package com.linked.list.doubly;

public class App {

	public static void main(String[] args) {

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertFirst(1);
		Node testNode = doublyLinkedList.insertLast(2);
		Node afterNode = doublyLinkedList.insertFirst(3);
		Node beforeNode = doublyLinkedList.insertLast(4);
		// doublyLinkedList.printLinkedNodesForward();
		doublyLinkedList.insertBeforeNode(beforeNode, 5);
		// doublyLinkedList.printLinkedNodesForward();
		// doublyLinkedList.printLinkedNodesBackward();
		doublyLinkedList.insertAfterNode(afterNode, 10);
		doublyLinkedList.insertAfterNode(testNode, 11);
		doublyLinkedList.printLinkedNodesForward();
		doublyLinkedList.printLinkedNodesBackward();

	}

}
