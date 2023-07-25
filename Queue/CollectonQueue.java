package Queue;

import java.util.*;

public class CollectonQueue {

	public static void main(String[] args) {
		
		
		Queue<Integer> q = new LinkedList<>();

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println("Front of q is " + q.peek());
		System.out.println("size of q is " + q.size());
		q.remove();
		System.out.println("Front of q after removal is " + q.peek());

		if(q.isEmpty())
		{
			System.out.println("QUEUE IS EMPTY");
		}
		else {
			System.out.println("QUEUE IS NOT EMPTY");
		}
		
	}

}
