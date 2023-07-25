package RecursionBasics;

import java.util.*;

public class ReverseAStringUsingRecursion {

	public static void main(String[] args) {
		
		String str = "MADAMeeee";
		
		char arr[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			
			arr[i] = str.charAt(i);
			
			
		}
		
		print(arr, 0, str.length()-1);
		
		
		
		

	}
	
	public static void print(char arr[], int start, int end) {
		
		
		//base case
		if(start > end) {
			
			String str ="";
			
			for(int i=0;i<arr.length;i++) {
				
				str = str+ arr[i];
			}
			
			System.out.print(str);
			return ;
		}
		
		
		//problem to a bigger problem depends on sub problems
		
		//swap
		char c = arr[start];
		
		arr[start] = arr[end];
		
		arr[end] = c;
		
		print(arr, start+1, end-1);
		
		
	
		
	}

}
