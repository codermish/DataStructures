package HashMap;

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Map.Entry;

public class Solution {
	
	
	public static void main(String args[]) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
 
	  arr1.add(1);
	  arr1.add(2);
	  arr1.add(3);
	  arr1.add(4);
	  arr1.add(5);
	  
	  arr2.add(2);
	  arr2.add(4);
	  arr2.add(6);
	  arr2.add(8);
		
	  ArrayList<Integer> ans = findSimilarity(arr1,arr2,arr1.size(),arr2.size());
		
	  System.out.print(ans);
		
	}
	
	
	
	
	
	public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
		
		Map<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<arr1.size();i++ ){

			if(map.get(arr1.get(i)) == null){
				map.put(arr1.get(i), 1);
			}
			else{
				map.put(arr1.get(i), map.get(arr1.get(i))+1);
			}
		}

		for(int i=0; i<arr2.size();i++ ){

			if(map.get(arr2.get(i)) == null){
				map.put(arr2.get(i), 1);
			}
			else{
				map.put(arr2.get(i), map.get(arr2.get(i))+1);
			}
		}

		List<Integer> ans = new ArrayList<>();
		int countSame =0;
		
		for(Entry<Integer, Integer> entry : map.entrySet()){

			if(entry.getValue() >1){
				countSame++;
			}
			
		}

		ans.add(countSame);
		ans.add(n+m - countSame);

		return (ArrayList<Integer>) ans;
	}
}
