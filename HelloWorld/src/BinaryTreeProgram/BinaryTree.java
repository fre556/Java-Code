package BinaryTreeProgram;
import java.util.*;
class BinaryTree {
	//root
	private Node root;
	
	//create a binary tree with root node
	public BinaryTree(Node root) {
		this.setRoot(root);
	}
	
	
	//create empt tree
	public BinaryTree() {
		this.setRoot(null);
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node root) {
		this.root = root;
	}
	
	
	public void insert(Node newNode) {
		if (this.root == null) {
			this.root = newNode;
		}
		else if (this.root.getLeft() == null) {
			this.root.setLeft(newNode);
		}
		else if (this.root.getRight() ==null) {
			this.root.setRight(newNode);
		}
		else {
			List<Node> siblingNodes = new LinkedList<Node>();
			siblingsNodes.add(this.root.getLeft());
			siblingsNodes.add(this.root.getRight());
			insert2(siblingsNode,newNode);
		}
		
	}
	
	
	//https://github.com/jackychu0830/binarytree/blob/master/src/main/java/com/jackychu/app/binary_tree/BinaryTree.java
	

}
