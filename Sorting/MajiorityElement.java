package Sorting;

import java.util.Arrays;

public class MajiorityElement {

	public static void main(String[] args) {
		
		
		int arr[] = {2,2,1,1,1,2,2};
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		int min = Arrays.stream(arr).min().getAsInt();
		
		int range = max - min +1;
		
		int temp[] = new int[ range +1];
		
		for(int i=0 ; i<arr.length; i++) {
			
			temp[arr[i]]++;
		}
		
		
		for(int i=0 ; i<temp.length; i++) {
			
			System.out.print(temp[i] +" ") ;
		}
		
		
	}

}
