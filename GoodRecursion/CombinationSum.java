package GoodRecursion;

import java.util.*;

public class CombinationSum {

	public static void main(String[] args) {

		List<List<Integer>> list = combinationSum();
//		System.out.print(list);
	}

	public static List<List<Integer>> combinationSum() {

		List<List<Integer>> finallist = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int arr[] = { 2, 3, 6, 7 };
		combinationSumFun(0, 7, list, finallist, arr);
		return finallist;

	}

	public static void combinationSumFun(int index, int target, List<Integer> list, List<List<Integer>> finallist,
			int[] arr) {

		
		//base case
		if (index == arr.length) {
			if (target == 0) {
				System.out.print(list+" ");
				finallist.add(list);
			
			}
			return;
		}

		//pick it
		if (arr[index] <= target) {
			list.add(arr[index]);
			combinationSumFun(index, target - arr[index], list, finallist, arr);
			list.remove(list.size() - 1);
		}
        //not pick
		combinationSumFun(index + 1, target, list, finallist, arr);

	}
}
