package com.anand.searchalgorithm.bst;

public class BST {
	private Node root;

	// BST where we would have root node, smaller than root node would be placed
	// in left child and greater than the
	// root node would be placed in right of the root node i.e right child.
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

	public boolean removeNode(int key) {

		// 1.Find the node to be removed.
		Node currentNode = root;
		Node parentNode = root;
		boolean isLeftChild = false;
		while (currentNode.key != key) {
			parentNode = currentNode;
			if (currentNode.key >= key) {
				currentNode = currentNode.leftChild;
				isLeftChild = true;
			} else {
				currentNode = currentNode.rigtChild;
				isLeftChild = false;
			}
			if (currentNode == null) {
				return false;
			}
		}

		Node nodeTodelete = currentNode;
		// 2.If the found node is a leaf node
		if (nodeTodelete.leftChild == null && nodeTodelete.rigtChild == null) {
			if (nodeTodelete == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.leftChild = null;
			} else {
				parentNode.rigtChild = null;
			}
		}

		// 3.If the found node has one child
		else if (nodeTodelete.rigtChild == null) {
			if (nodeTodelete == root) {
				root = nodeTodelete.leftChild;
			} else if (isLeftChild) {
				parentNode.leftChild = nodeTodelete.leftChild;
			} else {
				parentNode.rigtChild = nodeTodelete.leftChild;
			}
		} else if (nodeTodelete.leftChild == null) {
			if (nodeTodelete == root) {
				root = nodeTodelete.rigtChild;
			} else if (isLeftChild) {
				parentNode.leftChild = nodeTodelete.rigtChild;
			} else {
				parentNode.rigtChild = nodeTodelete.rigtChild;
			}
		}
		// 4.If the found node has two children
		else {
			Node successor = getSuccessor(nodeTodelete);

			// Connect parent of the node delete to the successor
			if (nodeTodelete == root) {
				root = successor;
			} else if (isLeftChild) {
				parentNode.leftChild = successor;
			} else {
				parentNode.rigtChild = successor;
			}
			successor.leftChild = nodeTodelete.leftChild;
		}

		return true;

	}

	private Node getSuccessor(Node nodeTodelete) {
		Node successor = nodeTodelete;
		Node successorParent = nodeTodelete;
		Node currentNode = nodeTodelete.rigtChild; // Go to the right child
		// Then have to find the minimum of this tree
		while (currentNode != null) {
			successorParent = successor;
			successor = currentNode;
			currentNode = currentNode.leftChild;
		}
		//If successor is not a right child
		if (successor != nodeTodelete.rigtChild) {
			successorParent.leftChild = successor.rigtChild;
			successor.leftChild = nodeTodelete.leftChild;
			successor.rigtChild = nodeTodelete.rigtChild;

		}
		return successor;
	}
	
	
	public void displayTree(){
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("-----------------------------------------------------------------------");

		
	}

}
