package com.anand.searchalgorithm.bst;

public class BST {
	private Node root;

	public void insertNode(int key, String value) {
		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			Node parentNode;
			while (true) {
				parentNode = currentNode;
				if (currentNode.key >= key) {
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parentNode.leftChild = newNode;
						return;
					}
				} else {
					currentNode = currentNode.rigtChild;
					if (currentNode == null) {
						parentNode.rigtChild = newNode;
						return;
					}

				}

			}

		}

	}

	public Node findMin() {
		Node leftLeaf = root;
		while (leftLeaf != null) {
			if (leftLeaf.leftChild == null) {
				return leftLeaf;
			} else {
				leftLeaf = leftLeaf.leftChild;
			}
		}
		return leftLeaf;
	}
	public Node findMax() {
		Node rightLeaf = root;
		while (rightLeaf != null) {
			if (rightLeaf.rigtChild == null) {
				return rightLeaf;
			} else {
				rightLeaf = rightLeaf.rigtChild;
			}
		}
		return rightLeaf;
	}
	
	
}
