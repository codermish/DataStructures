package LinkedList;

public class InsertNodeAtParticularPosn {

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
		Node<Integer> tail = node5;
		head = insertAtMiddle(head, 100, 6, tail);

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;

		}

	}

	public static Node<Integer> insertAtMiddle(Node<Integer> head, int data, int pos, Node<Integer> tail) {

		Node<Integer> newNode = new Node(data);
		Node<Integer> temp = head;

		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		}

		else {

			int counter = 1;
 			while (temp.next != null) {

				if (counter == pos - 1) {
					Node<Integer> temp2 = temp.next;
					temp.next = newNode;
					newNode.next = temp2;

				}
				counter++;
				temp = temp.next;

			}

			if (temp.next == null && counter == pos - 1) {

				tail.next = newNode;
				newNode = tail;

			}

		}
		return head;

	}

}
