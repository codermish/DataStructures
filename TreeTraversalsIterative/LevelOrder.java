 package TreeTraversalsIterative;

import java.util.*;

public class LevelOrder {

	public static void main(String[] args) {
		Node<Integer> root = new Node(10);
		root.left = new Node(20);
		root.right= new Node(30);
		root.left.left = new Node(40);
		levelOrderTraversal(root);
	}
	
	public static void levelOrderTraversal(Node<Integer> root) {
		
		if(root==null) {
			return;
		}
		Queue<Node<Integer>> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()) {			
			Node<Integer> peek = queue.peek();
			queue.remove();
			if(peek == null && !queue.isEmpty()) {
				System.out.println();
				queue.add(null);
				
			}
			else if(queue.isEmpty()) {
				return;
			}
			else {
				
				System.out.print(peek.data+" ");
				if(peek.left != null) {
					queue.add(peek.left);
				}
				if(peek.right != null) {
					queue.add(peek.right);
				}
				
			}			
		}
		
	}

}
