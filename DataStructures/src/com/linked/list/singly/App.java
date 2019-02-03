package com.linked.list.singly;

public class App {

	public static void main(String[] args) {

		SingleLinkedList singleLinked = new SingleLinkedList();
		singleLinked.printLinkedNodes();

		singleLinked.insertFirst(1);
		singleLinked.insertLast(2);
		singleLinked.insertFirst(3);
		singleLinked.insertLast(4);
		singleLinked.printLinkedNodes();
		singleLinked.deleteFirst();
		singleLinked.printLinkedNodes();
		singleLinked.deleteLast();
		singleLinked.deleteLast();
		singleLinked.printLinkedNodes();

	}

}
