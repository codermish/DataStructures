package LinkedList;
import java.util.*;

public class DetectLoopInLLExtraSpace {

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
		node5.next = null;
		

		boolean val = detectLoop(node1);
		
		System.out.println(val);
		
		
	}
	
	public static boolean detectLoop(Node<Integer> head) {
		
		Set<Node<Integer>> set = new HashSet<>();
		
		while(head != null) {
			
			if(set.contains(head)) {
				return true;
			}
			
			set.add(head);
			head = head.next;
			
			
		}
		
		return false;
		
	}

}
