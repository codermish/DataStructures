package Sorting;

import java.util.Arrays;


public class NumberSmallerThanEach {

	public static void main(String[] args) {

		int nums[] = { 8, 1, 2, 2, 3,5,2,6,1,5 };

		int res[] = smallerNumbersThanCurrent(nums);

	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {

		int max = Arrays.stream(nums).max().getAsInt();
		int min = Arrays.stream(nums).min().getAsInt();
		int range = max - min + 1;

		int temp[] = new int[range + 1];

		for (int i = 0; i < nums.length; i++) {

			temp[nums[i]]++;

		}

		for (int i = 0; i < temp.length; i++) {

			System.out.print(temp[i] + " ");

		}
		
		System.out.println();
		System.out.println("number of elements smaller than give code...");
		
		int res[] = new int[range];
		res[1] =0;
		for(int i=2;i<= range;i++) {
			res[i] = res[i-1] + temp[i-1];
			
		}
	
		for (int i =1; i <= res.length; i++) {

			System.out.print(res[i]);

		}
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < temp.length; i++) {
//
//		   map.put(i, temp[i] -1 );
//
//		}
//		
//		System.out.println();
//		System.out.println("map formed is:");
//		System.out.println(map);
		
		
		

		return temp;

	}
}
