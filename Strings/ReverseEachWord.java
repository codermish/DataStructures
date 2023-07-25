package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
	
		String str = "My name is Anugya Sharma!!";
		
		String ans[] = str.split(" ");
		String res = "";
		
		for(int i=0;i<ans.length;i++) {
			String a = rev(ans[i]);
			
			res = res + a +" ";
			
		}
		
		
	}
	
	
	public static String rev(String str) {
		
		int i=0;
		int j= str.length() -1;
		
		char arr[] = str.toCharArray();
		
		while(i<j) {
			
			char temp = arr[i];
			arr[i]  = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
			
		}
		
		String res = new String(arr);
		return res;
		
	}

}
