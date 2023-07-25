package LinkedList;

public class ReverseALLIterative {

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

		Node<Integer> head = node1;
		Node<Integer> temp = node1;
		System.out.println("Before reversing: ");

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}

		head = reverseAlL(head);
		System.out.println();
		System.out.println("After reversing: ");

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	
	public static Node<Integer> reverseAlL(Node<Integer> head) {

		// three pointers current, prev, next
		Node<Integer> current = head;
		Node<Integer> prev = null;
		Node<Integer> next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}

		return prev;

	}
}
