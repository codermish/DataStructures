package GoodRecursion;

import java.util.*;

public class SubsequenceSumEqualToK {

	public static void main(String[] args) {
		int arr[] = {1, 2,3};
		int val = 3;
		List<Integer> list = new ArrayList<>();
		printSubEqualToSum(0,arr,0,val,list);
		
		

	}
	
	public static void printSubEqualToSum(int index, int[] arr, int sum, int val, List<Integer> list ) {
				
		if(index == arr.length) {		
			if(sum == val ) {
			
			System.out.print(list);
		
		}
			return;			
			}
		
		list.add(arr[index]);
		sum = sum + arr[index];
		printSubEqualToSum(index+1, arr, sum, val, list);
		
		sum = sum - arr[index];

		list.remove(list.size()-1);
		printSubEqualToSum(index+1, arr, sum, val, list);
		
		
		
		
	}

}
