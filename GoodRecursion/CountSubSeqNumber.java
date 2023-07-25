package GoodRecursion;

import java.util.ArrayList;
import java.util.List;

public class CountSubSeqNumber {

	public static void main(String[] args) {
		int arr[] = {1, 2,3};
		int val = 3;
		List<Integer> list = new ArrayList<>();
		 printSubEqualToSum(0,arr,0,val,list,0);
		
	}
		
	
	public static void printSubEqualToSum(int index, int[] arr, int sum, int val, List<Integer> list, int count ) {
				
		if(index == arr.length) {		
			if(sum == val ) {
			count ++;			
				
		}
			System.out.print(count);
			return;
			
		}
		
			list.add(arr[index]);
			sum = sum + arr[index];
					
			printSubEqualToSum(index+1, arr, sum, val, list, count);
			
			sum = sum - arr[index];

			list.remove(list.size()-1);
		
			printSubEqualToSum(index+1, arr, sum, val, list, count);
		
		
		
	}


}
