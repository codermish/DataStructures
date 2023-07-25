package Strings;

public class ReverseStringWordWise {

	public static void main(String[] args) {

		
		String str = "My name is Anugya Sharma";
		String res ="";
		String arr[] = str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			res = res + arr[i] +" ";
			
			
			
		}
		
		System.out.print(res.trim());

	}

}
