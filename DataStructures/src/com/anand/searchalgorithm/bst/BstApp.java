package com.anand.searchalgorithm.bst;

public class BstApp {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insertNode(5, "Five");
		bst.insertNode(4, "Four");
		bst.insertNode(19, "Nineteen");
		bst.insertNode(6, "six");
		bst.insertNode(1, "six");
		bst.insertNode(100, "hundred");

		System.out.println(bst.findMin().key);
		System.out.println(bst.findMax().key);
		System.out.println(bst.removeNode(1));
		System.out.println(bst.findMin().key);

	}

}
