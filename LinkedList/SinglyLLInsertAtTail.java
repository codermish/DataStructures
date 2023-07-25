package LinkedList;

import java.util.*;

public class SinglyLLInsertAtTail {

	public static void main(String[] args) {

		Node<Integer> node1 = new Node(10);
		Node<Integer> node2 = new Node(40);
		node1.next = node2;
		Node<Integer> head = node1;
		Node<Integer> tail = node2;
		System.out.println("enter the data you want to insert");

		Scanner obj = new Scanner(System.in);
		int data = obj.nextInt();
		tail = insertAtTail(head, data, tail);

		int data2 = obj.nextInt();
		insertAtTail(head, data2, tail);
	}

	public static Node<Integer> insertAtTail(Node<Integer> head, int data, Node<Integer> tail) {

		Node<Integer> newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

		return tail;
	}
}
