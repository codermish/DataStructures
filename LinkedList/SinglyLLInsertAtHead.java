package LinkedList;

public class SinglyLLInsertAtHead {

	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node(10);
		
		Node<Integer> n2 = new Node(20);
		
		Node<Integer> head = n1;
		
		
		System.out.println(head.data);
		insertAtHead(head, n2);
		
		

	}
	
	public static void insertAtHead(Node<Integer> head, Node<Integer> temp) {
		
		temp.next = head;
		head = temp;
		
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		
		
	}

}
