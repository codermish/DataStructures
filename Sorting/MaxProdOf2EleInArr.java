package Sorting;

import java.util.Arrays;

public class MaxProdOf2EleInArr {
	
	
	public static void main(String[] args) {

		
		int arr[] = {3,4,5,2};
		Arrays.sort(arr);
		
		System.out.print((arr[arr.length-1] -1 )* (arr[arr.length-2] -1)); 
		
		
		
		
	}

}
