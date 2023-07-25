package Stack;

import java.util.Stack;

public class SortAStackUsingRecursion {
	static Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		
		st.push(5);
		st.push(-2);
		st.push(9);
		st.push(-7);
		st.push(3);
		
		sortStackUsingRecursion(st);
		
		for(Integer val : st) {
			
			System.out.print(val+" ");
		}

	}
	
	public static void sortStackUsingRecursion(Stack<Integer> st ) {
		
		if(st.isEmpty()) {
			return;
		}
		int temp = st.peek();
		st.pop();
		sortStackUsingRecursion(st);
		insertAtCorrectPos(temp, st);

		
	}
	
	public static void insertAtCorrectPos(int num, Stack<Integer> st) {
		
		if(st.isEmpty() || st.peek() < num) {		
			st.push(num);
			return;
		}
		
		int temp = st.peek();
		st.pop();
		insertAtCorrectPos(num, st);
		st.push(temp);
		
		

		}

}
