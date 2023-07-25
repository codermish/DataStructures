package LinkedList;

import java.util.*;

public class StartingPosnOfTheLoop {

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
		node5.next = node2;
		
		
		
		
		int len = findStartPoint(node1);
		
		System.out.print(len);
		
	}
	
	public static int findStartPoint(Node<Integer> head) {
		
		Set<Node<Integer>> set = new HashSet<>();
		int count=0;
		while(head!=null) {
			
			if(set.contains(head)) {
				
				return count;
				
			}
			else {
				set.add(head);
				count++;
			}
			
			head = head.next;
			
			
		}
		
		return -1;
		
	}

}
