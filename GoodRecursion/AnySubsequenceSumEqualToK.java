package GoodRecursion;

import java.util.ArrayList;
import java.util.List;

public class AnySubsequenceSumEqualToK {

	public static void main(String[] args) {
		int arr[] = {1, 2,3};
		int val = 3;
		List<Integer> list = new ArrayList<>();
		printSubEqualToSum(0,arr,0,val,list);

	}
		
	
	public static boolean printSubEqualToSum(int index, int[] arr, int sum, int val, List<Integer> list ) {
				
		if(index == arr.length) {		
			if(sum == val ) {
			
			System.out.print(list);
			return true;
		
		}
			return false;			
			}
		
		list.add(arr[index]);
		sum = sum + arr[index];
		if(printSubEqualToSum(index+1, arr, sum, val, list) == true) {
			return true;
		}

			
			printSubEqualToSum(index+1, arr, sum, val, list);
			
			sum = sum - arr[index];

			list.remove(list.size()-1);
			if(printSubEqualToSum(index+1, arr, sum, val, list) == true) {
				return true;
			}
			printSubEqualToSum(index+1, arr, sum, val, list);
		
		
		return false;
		
	}

}
