package Trees;

import java.util.*;

public class ZigZagOrSpiralTraversal {

	public static void main(String[] args) {
		
		Node<Integer> root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.left.right = new Node(7);
		root.right.left.right.right = new Node(8);
		
		

	}
	
	public static List<List<Integer>> zigZag(Node<Integer> root){
		
		List<List<Integer>> finalList  = new ArrayList<>();
		Queue<Node<Integer>> q = new LinkedList<>();
		if(root == null)
		return finalList;
		q.add(root);
		q.add(null);
		boolean leftToRight = true;
		while(!q.isEmpty()) {
			
			int size = q.size();
			List<Integer> arr = new LinkedList<>();

			for(int i=0;i<size;i++) {
				
				Node<Integer> top = q.remove();
				
				if(top != null) {
					
					int index = leftToRight? i : size-1-i;
					arr.add(index, top.data);
					q.add(top.left);
					q.add(top.right);
					
				}
				else if(!q.isEmpty()){
					
					q.add(top);
					finalList.add(arr);
					arr= new LinkedList<>();
					
					
				}
							
			}
			
			
			
			
		}
		
		return finalList;
	}

}
