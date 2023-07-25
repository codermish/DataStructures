package Stack;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println("top element is " + st.peek());
		
		st.pop();
		
		
		System.out.println("top element after removing one element is " + st.peek());

		if(st.empty()) {
			System.out.println("stack is empty");	
		}
		else{
			System.out.println("stack is not empty");	
		}
		
		System.out.println("size of stack is " + st.size());	

	}


}
