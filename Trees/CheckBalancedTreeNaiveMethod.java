package Trees;

public class CheckBalancedTreeNaiveMethod {

	
	public static void main(String args[]) {
		
		Node<Integer> root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(2);
		root.left.left = new Node(5);
		root.left.right = new Node(4);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(6);
		root.left.right=  new Node(4);
		root.right = new Node(2);
		
		boolean val = checkBalanced(root);
		
		System.out.print(val);
	}
	
	public static boolean checkBalanced(Node<Integer> root) {
		
		if(root == null)
			return true;
		
		int hlt = checkHeight(root.left);
		int rlt = checkHeight(root.right);
		
		if(Math.abs(hlt - rlt) >1) {
			
			return false;
			
		}
		

		boolean left = checkBalanced(root.left);
		boolean right = checkBalanced(root.right);
		
		if(!left || !right) {
			return false;
		}
		
		return true;
		
	}
	
	public static int checkHeight(Node<Integer> root) {
		
		
		
		if(root == null)
			return 0;
		
		int lh = checkHeight(root.left);
		int rh = checkHeight(root.right);
		
		return ( 1 + Math.max(lh, rh));
		
		
	}
	
	
	
	
}
