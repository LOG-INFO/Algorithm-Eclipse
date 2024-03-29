package datastructures.trees;

public class BinarySearchTree {
	private Node root;
	private int size;

	public BinarySearchTree() {
		super();
		this.root = null;
	}

	public void add(int num) {
		Node node = new Node(num);
		if (root == null) {
			this.root = node;
		} else {
			Node current = null;
			Node next = this.root;
			while (true) {
				current = next;
				if (current.data > num) {
					next = current.left;
					if (next == null) {
						current.left = node;
						size++;
						return;
					}
				} else if (current.data < num) {
					next = current.right;
					if (next == null) {
						current.right = node;
						size++;
						return;
					}
				} else {
					throw new RuntimeException("Already has same data : " + num);
				}
			}
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean has(int num) {
		return getNode(num) != null;
	}

	public Node getNode(int num) {
		Node node = this.root;
		while (node != null && node.data != num) {
			if (node.data > num) {
				node = node.left;
			} else if (node.data < num) {
				node = node.right;
			} else {
				return node;
			}
		}
		return node;
	}

	class Node {
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

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.add(1);
		bst.add(6);
		bst.add(2);
		bst.add(4);
		bst.add(9);
		bst.add(7);
		bst.add(3);
		
		System.out.println("bst.has(3) : " + bst.has(3));
		System.out.println("bst.has(11) : " + bst.has(11));
		System.out.println("bst.has(7) : " + bst.has(7));
		System.out.println("bst.has(5) : " + bst.has(5));

//		bst.add(3);
	}
}
