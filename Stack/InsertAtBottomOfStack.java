package Stack;

import java.util.Stack;

public class InsertAtBottomOfStack {

	public static void main(String[] args) {		
		Stack<Integer> st = new Stack<>();
		st.push(7);
		st.push(1);
		st.push(4);
		st.push(5);		
		System.out.println(st.size());
		insertAtBottom(st,  100,  0 ,  st.size());		
		for(Integer val:st) {
			System.out.print(val+" ");
		}
	}
	
	public static void insertAtBottom(Stack<Integer> st, int num, int count, int size) {		
		//base case
		if(count == size) {
			st.push(num);
			return;
		}
		
		int temp  = st.peek();
		st.pop();		
		insertAtBottom(st,num, count+1,size);
		st.push(temp);		
		
	}

}
