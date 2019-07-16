package datastructures.trees;

public class BinarySearchTree {
	private Node root;
	private int size;
	
	public BinarySearchTree() {
		super();
		this.root = null;
	}
	
	public void add(int num) {
		if(root==null) {
			this.root = new Node(num);
		}else {
//			if()
		}
		
	}

	class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}