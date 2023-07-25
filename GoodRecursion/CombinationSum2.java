package GoodRecursion;

import java.util.*;

public class CombinationSum2 {

	public static void main(String[] args) {

		int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Set<List<Integer>> finalSet = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		Set<List<Integer>> res =findAllComb(arr, target, finalSet, list, 0);
//		System.out.print(res + " ");
	}

	public static Set<List<Integer>> findAllComb(int[] arr, int target, Set<List<Integer>> finalSet, List<Integer> list, int index) {

		// base case
		if (index == arr.length) {
			if (target == 0) {
				Collections.sort(list);
				finalSet.add(list);
		
				System.out.println(finalSet + " ");

			}
			return finalSet;
		}

		// pick
		if (arr[index] <= target) {
			list.add(arr[index]);
			findAllComb(arr, target - arr[index], finalSet, list, index + 1);
			list.remove(list.size() - 1);
		}

		// not pick
		findAllComb(arr, target, finalSet, list, index + 1);

		return finalSet;
	}

}
