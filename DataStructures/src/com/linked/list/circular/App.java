package com.linked.list.circular;

public class App {

	public static void main(String[] args) {

		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.printLinkedNodes();

		circularLinkedList.insertFirst(1);
		circularLinkedList.insertLast(2);
		circularLinkedList.insertFirst(3);
		circularLinkedList.insertLast(4);
		circularLinkedList.printLinkedNodes();
		circularLinkedList.deleteFirst();
		circularLinkedList.printLinkedNodes();
		circularLinkedList.deleteLast();
		circularLinkedList.printLinkedNodes();

	}

}
