package Trees;

public class PostOrderTraversal {

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
		postOrder(root);

	}
	
	public static void postOrder(Node<Integer> root) {
		
		if(root == null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data +" ");
	
		
	}

}
