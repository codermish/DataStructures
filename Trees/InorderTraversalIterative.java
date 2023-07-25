package Trees;

import java.util.Stack;

public class InorderTraversalIterative {

	public static void main(String[] args) {
		
		Node<Integer> root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);

		inOrder(root);

	}
	
	public static void inOrder(Node<Integer> root) {

		if (root == null)
			return;
		Stack<Node<Integer>> st = new Stack<>();

		st.push(root);

		while (!st.isEmpty()) {

			Node<Integer> peek = st.peek();
			st.pop();
			if (peek == null) {
				return;
			} else {
				System.out.print(peek.data + " ");

				if (peek.left != null)
					st.push(peek.left);
				if (peek.right != null)
					st.push(peek.right);
			}

		}

	}

}
