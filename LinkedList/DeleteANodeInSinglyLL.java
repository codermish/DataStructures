package LinkedList;

public class DeleteANodeInSinglyLL {

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
		head = deleteAtPos(3,head);
		
		while(head != null) {
			
			System.out.print(head.next +" ");
			head = head.next;
			
		}

	}
	
	public static Node<Integer> deleteAtPos(int pos, Node<Integer> head){
		
		if(pos==1) {
			head.next = head;
		}
		
		else {
			Node<Integer> temp = head;
			Node<Integer> prev = null;
			
			
			int counter = 1;
			
			
			while(temp != null) {
				prev = temp;
				temp = temp.next;
				if(counter == pos ) 
				{
					prev.next = temp.next;
				}
				
				counter++;
				
				
			}
			
			
			
		}
		
		return head;
		
		
	}

}
