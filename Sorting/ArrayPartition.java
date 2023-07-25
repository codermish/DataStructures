package Sorting;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {

		int nums[] = { 6, 2, 6, 5, 1, 2 };

		Arrays.sort(nums);

		int sum = 0;

		for (int i = 0; i < nums.length - 1; i = i + 2) {

			int min = Integer.min(nums[i], nums[i + 1]);

			sum = sum + min;

		}

		System.out.println();

		System.out.print(sum);

	}

}
