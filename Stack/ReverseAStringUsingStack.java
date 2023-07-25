package Stack;

import java.util.Stack;

public class ReverseAStringUsingStack {

	public static void main(String[] args) {
		
		String str = "Anugyaaa";
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		
		String ans = "";
		
		while(!st.empty()) {
			ans = ans + st.peek();
			st.pop();
			
		}
		
		System.out.print(ans);

	}

}
