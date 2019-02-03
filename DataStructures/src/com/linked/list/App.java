package com.linked.list;

public class App {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 1;

		Node nodeB = new Node();
		nodeB.data = 2;

		nodeA.nextNode = nodeB;

		System.out.println(listlength(nodeB));
	}

	public static int listlength(Node node) {
		int length = 0;
		Node currentNode = node;
		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
			length++;
		}

		return length;
	}
}
