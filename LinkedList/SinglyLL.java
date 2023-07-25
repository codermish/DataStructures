package LinkedList;

public class SinglyLL {

//	public static void main(String[] args) {
//		
//		
//		Node<Integer> node1 = new Node(1);
//		Node<Integer>  node2 = new Node(2);
//		Node<Integer>  node3 = new Node(3);
//		Node<Integer>  node4 = new Node(4);
//		
//		Node<Integer>  head = node1;
//		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		
//		print(head);
//		print(head);
//	
//		
//	
//
//	}
//	
//	public static void print(Node<Integer> head) {
//		
//	while(head.next != null) {
//			
//			System.out.print(head.data +" ");
//			head = head.next;
//			
//		}
//	System.out.print(head.data +" ");
//	
//	System.out.println();	
//	}
	
	
	 public static void print(Node<Integer> head){
		    Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
		}

		public static void increment(Node<Integer> head){
		    Node<Integer> temp = head;
		    while(temp != null){
		        temp.data++;
		        temp = temp.next;
		    }
		}

		public static void main(String args[]){

		    Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer> node2 = new Node<Integer>(20);
		    node1.next = node2;
		    increment(node1);
		    print(node1);
		   }

}
