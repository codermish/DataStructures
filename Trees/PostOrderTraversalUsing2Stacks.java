package Trees;

import java.util.Stack;

public class PostOrderTraversalUsing2Stacks {

	public static void main(String[] args) {
		
		Node<Integer> root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left.right = new Node(7);
		root.right.left.right.right = new Node(8);
		
		postOrderTraversal(root);

	}
	
	public static void postOrderTraversal(Node<Integer> root) {
		
		if(root == null)
			return;
		
		Stack<Node<Integer>> st1 = new Stack<>();
		Stack<Node<Integer>> st2 = new Stack<>();
		
		st1.push(root);
		
		while(!st1.isEmpty()) {
			
			Node<Integer> top = st1.peek();
			st2.push(top);
			st1.pop();
			
			if(top.left != null) {
				st1.push(top.left);
			
			}
			
			if(top.right != null) {
				st1.push(top.right);
			
			}
			
		}
		System.out.println("size is " + st2.size());
		
		while(!st2.isEmpty()) {
			
			System.out.print(st2.peek().data +" ");
			st2.pop();
		}
	

		
	}

}
