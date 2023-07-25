package Stack;

import java.util.Stack;

public class StackInsertAtCorrectPos {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(1);
		st.push(5);
		st.push(9);
		
		
		insertAtCorrectPos(st,6);
		
		for(Integer num: st) {
			System.out.print(num +" ");
		}

	}
	
	
	
	public static void insertAtCorrectPos(Stack<Integer> st, int num) {
		
		int top = st.peek();
		
		if(top < num) {
			
			st.push(num);
			return;
		}
		
		else {
			
			st.pop();
			
			insertAtCorrectPos(st, num);
			
			st.push(top);
			
		}
		
		
	}

}
