package Trees;

public class BinaryTreeRepresentation {

	public static void main(String[] args) {
		
		
		Node<Integer> root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		
		root.left.left = new Node(40);
		
		while(root != null) {
			System.out.print(root.data +" ");
			root= root.left;
		}
		

	}

}
