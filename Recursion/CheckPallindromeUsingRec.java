package Recursion;

public class CheckPallindromeUsingRec {

	public static void main(String[] args) {
		
		String str = "MADAMEE";
		
		boolean val = checkVal(str,0, str.length()-1);
		
		System.out.print(val);

	}
	
	
	public static boolean checkVal(String str, int left, int right) {
		
		if(left>right)
		{
			return true;
		}
		
		if(str.charAt(left) != str.charAt(right)) {
			return false;
		}
		
		return checkVal(str,left+1, right-1);
		
	}

}
