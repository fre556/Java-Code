package BinaryTreeProgram;



public class Node {
	
	private Object value;
	private Node left , right;
	
	
	public Node (){
	
	}
	
	public Node(Object value) {
		this.value = value;	
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}

}
