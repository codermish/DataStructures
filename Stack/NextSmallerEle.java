package Stack;

import java.util.Stack;

public class NextSmallerEle {

	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3};
		
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		
		int[] ans = new int[arr.length];
		int n = ans.length;
		for(int i = n-1; i>=0;i-- ) {
			
			int peek = st.peek();
			
			while(peek > arr[i]) {
					st.pop();
				}
			
			ans[i] = peek;
			st.push(arr[i]);
			}
		
		
		for(int p=0;p<ans.length;p++) {
			System.out.print(ans[p] +" ");
		}
		

	}
	
	

}
