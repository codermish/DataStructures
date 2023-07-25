package Recursion;

import java.util.*;

public class PracticeSubse {

	public static void main(String[] args) {

		// program to print all subseq
		int arr[] = { 3, 2, 1 };

		// subsequence = contigeous or non contiqeous sub array with follows and order

		// [], [3], [2], [1], [3,2], [2,1], [3,1]

		int sum = 3;
		List<Integer> list = new ArrayList<>();

		print(arr, 0, list, sum, 0, 0);

	}

	public static void print(int arr[], int index, List<Integer> list, int sum, int current, int count) {

		if (current == sum) {

			count++;
			
		}
		
		if (index == arr.length) {
			System.out.print(count + " ");
			return;
		}
		current += arr[index];
		list.add(arr[index]);
		print(arr, index + 1, list, sum, current, count);

		list.remove(list.size() - 1);
		current -= arr[index];
		print(arr, index + 1, list, sum, current, count);

	}

}
