package LinkedList;

import java.util.*;

public class StartingPointOfLL {

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

		Node<Integer> data = detectCycle(head);
		System.out.print(data.data);

	}

	public static Node<Integer> detectCycle(Node<Integer> head) {

		Node<Integer> slow = head;
		Node<Integer> fast = head;
		int count = 1;
		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				System.out.print("inside loop");
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}

		}

		return null;

	}

}
