package Stack;

import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.push(5);
		st.push(-2);
		st.push(9);
		st.push(-7);
		st.push(3);
		
		sortAStack(st);
		
		for(Integer val: st) {
			System.out.print(val +" ");
		}
		

	}
	
	public static void sortAStack(Stack<Integer> st) {
		
		if(st.empty()) {
			return;
		}

				
				int peek = st.peek();
				st.pop();
				sortAStack(st);
				insertAtCorrectPos(st,peek);
				
			
		}
		
	
	
	public static void insertAtCorrectPos(Stack<Integer> st, int num) {
		
		
		if(st.empty() || st.peek() < num) {
			st.push(num);
		}

				else {
					int peek = st.peek();
					st.pop();
					insertAtCorrectPos(st,num);
					st.push(peek);
					
				}
				
			}
			
}
