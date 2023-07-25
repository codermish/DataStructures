package Sorting;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {

	public static void main(String[] args) {

		int nums[] = {5,6,2,7,4};
		
		Arrays.sort(nums);
		
		
		
		int max= nums[nums.length-1] *  nums[nums.length-2];
		int min= nums[0] * nums[1];
		
		
		
		System.out.print(max - min) ;
		
	}

}
