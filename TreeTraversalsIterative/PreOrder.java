package TreeTraversalsIterative;
import java.util.*;
public class PreOrder {

	public static void main(String[] args) {
		Node<Integer> root = new Node(10);
		root.left = new Node(20);
		root.right= new Node(30);
		root.left.left = new Node(40);
		preOrder(root);

	}
	
	public static void preOrder(Node<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		Stack<Node<Integer>> st = new Stack<>();
		st.add(root);
		
		while(!st.isEmpty()) {
			
			Node<Integer> peek = st.peek();
			st.pop();
			if(peek == null) {
				return;
			}
			System.out.print(peek.data+" ");
			if(peek.right != null)
			st.push(peek.right);
			if(peek.left != null)
			st.push(peek.left);
			
		}
		
		
	}

}
