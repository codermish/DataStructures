package LinkedList;

public class DetectALoopInLLNoExtraSpace {

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
		

		boolean val = detectLoop(node1);
		
		System.out.println(val);
		

	}
	
	public static boolean detectLoop(Node<Integer> head) {
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast!= null && fast.next !=null) {
			
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
			
			
		}
		
		return false;
		
		
		
	}

}
