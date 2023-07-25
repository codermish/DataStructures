package Trees;

import java.util.*;

public class LevelOrderTraversal {

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
		List<List<Integer>> ans = levelOrder(root);
		System.out.print(ans);

	}

//	public static void levelOrder(Node<Integer> root) {
//
//		if (root == null)
//			return;
//
//		Queue<Node<Integer>> q = new LinkedList<>();
//		// to initialize add root and null at the last, null signifies the end of level 
//		
//		q.add(root);
//		q.add(null);
//
//		while (!q.isEmpty()) {
//			
//			Node<Integer> peek = q.peek();
//			q.remove();
//			if (peek == null) {
//				q.add(peek);
//			}
//
//			else {
//				System.out.print(peek.data+" ");
//				
//				if (peek.left != null) {
//					q.add(peek.left);
//				}
//
//				if (peek.right != null) {
//					q.add(peek.right);
//				}
//			}
//
//		}
//
//	}

	
	
	public static List<List<Integer>> levelOrder(Node<Integer> root) {

		Queue<Node<Integer>> q = new LinkedList<>();

		List<List<Integer>> list = new LinkedList<>();

		if (root == null)
			return list;

		// to initialize add root and null, null signifies the end of level

		q.add(root);
		q.add(null);

		List<Integer> levelList = new LinkedList<>();

		while (!q.isEmpty()) {
			
			Node<Integer> peek = q.remove();
			if (peek != null) {
				levelList.add(peek.data);
				if (peek.left != null) {
					q.add(peek.left);
				}

				if (peek.right != null) {
					q.add(peek.right);
				}

			}

			else if (!q.isEmpty()) {
				q.add(peek);
				list.add(levelList);
				levelList = new LinkedList<>();
			}

		}
		list.add(levelList);
		return list;
	}
}
