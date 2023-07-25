package Trees;
import java.util.*;
public class MaximumHeightOfBTUsingRecursiveMethod {

	public static void main(String[] args) {
		
		List<List<Integer>> list  =  new ArrayList<>();
		Node<Integer> root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left.right = new Node(7);
		root.right.left.right.right = new Node(8);
		
		int val = maxHeight(root);
		
		System.out.print(val);
		
		
	}

	public static int maxHeight(Node<Integer> root) {
		
		if(root == null) {
			return 0;
		}
		
		int lh = maxHeight(root.left);
		int rh = maxHeight(root.right);
		
		return (1 + Integer.max(lh, rh));
		
	}
}
