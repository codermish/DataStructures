package Sorting;

import java.util.Arrays;

public class CountSort {
	public static void main(String args) {
		
		int arr[] = {5,2,5,5,3,1,2,5,1,5,0,5,3,1,5,2,2,2};
		
		int res[] = new int[arr.length];
		
		
		//step 1 calculate range - only these elements can exist
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();	
		int range = max - min + 1;
		
		//create temporary array to store the freq of each elements
		
		int temp[] = new int[range];
			
		// update frequencies
		
		for(int i=0;i<arr.length;i++) {
			
			temp[arr[i]]++;
		}
		
		System.out.println("temporary array containing frequency is: ");
		
		for(int i=0;i<temp.length;i++) {
			
			System.out.print(temp[i] +" ");
		}
		
		//update freq array to as to store the position of these elements in sorted array
		
		
		for(int i=1;i<temp.length;i++) {
			
			temp[i] = temp[i] + temp[i-1];
		}
		
		System.out.println();
		System.out.println("temporary array after updating frequency is: ");
		
		for(int i=0;i<temp.length;i++) {
			
			System.out.print(temp[i] +" ");
		}
		
		// we will start from end and will add the values corresponding to the res
		
		for(int i = arr.length-1;i>=0;i++) {
			
			res[temp[arr[i]] -1 ] = arr[i];
			temp[arr[i] ] = temp[arr[i]] -1;
		}
		
		System.out.println();
		System.out.println("final array is: ");
		
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] +" ");
		}
	
		
	
	

	}
	

}
