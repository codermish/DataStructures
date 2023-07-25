package Stack;

import java.util.Stack;

public class DeleteMiddleElementFromStack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		solve(st, 0 , st.size());
		
		
		for(Integer val: st) {
			System.out.print(val+" ");
		}


	}
	
	public static void solve(Stack<Integer> st, int count , int size) {
		
		if(count == size/2) {
			st.pop();
			return;
		}
		else {
			int temp = st.peek();
			st.pop();
			solve(st,count+1, size);		
			st.push(temp);
		}
		
	
	
		
	}

}
