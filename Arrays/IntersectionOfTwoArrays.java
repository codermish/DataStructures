package Arrays;
import java.util.*;
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
	boolean ans = 	isValid("(){}");
		
	System.out.print(ans);

	}
	
	
	  public static boolean isValid(String s) {
		  
		  Stack<Character> st = new Stack<>();
		  
		  for(int i=0; i<s.length();i++) {
			  
			  if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {			  
				  st.push(s.charAt(i));
			  }
			  else {
				  
				  char last = st.peek();	
				  st.pop();
				  if(last =='(' && s.charAt(i) ==')' || 	
					 last =='{' && s.charAt(i) =='}' || 
				     last =='[' && s.charAt(i) ==']' ) {
					  
				  }
				  else {
					  return false;
				  }
					  
				  
			  }
			  
		  }
		  if(st.isEmpty()) {
			  return true;
		  }
		  else {
			  return false;
		  }
		  
	        
	    }

}
