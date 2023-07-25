package LinkedList;

public class DeleteMiddleNodeOfLL {

	public static void main(String[] args) {
		
		
		Node<Integer> node1 = new Node(10);
		Node<Integer> node2 = new Node(20);
		Node<Integer> node3 = new Node(30);
		Node<Integer> node4 = new Node(40);
		Node<Integer> node5 = new Node(50);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node4.next = node2;

		Node<Integer> head = node1;
		
		

	}

}
