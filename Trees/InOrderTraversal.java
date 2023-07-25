package Trees;

public class InOrderTraversal {

	public static void main(String[] args) {
		Node<Integer> root = new Node(1);
		root.left =new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right = new Node(8);		
		root.right.right.left  = new Node(9);
		root.right.right.right  = new Node(10);
		inOrder(root);

	}
	
	public static void inOrder(Node<Integer> root) {
		
		if(root == null)
			return;
		
		inOrder(root.left);
	
		System.out.print(root.data +" ");
		
		inOrder(root.right);
	
		
	}

}
