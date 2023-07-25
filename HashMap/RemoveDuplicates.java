package HashMap;

import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3,4,4,4,5,7,6,6};
		removeDup(arr);
//		Set<Integer> set = new HashSet<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			set.add(arr[i]);
//		}
//		for(Integer val : set) {
//			System.out.print(val+" ");
//		}
		

	}
	
	public static void removeDup(int arr[]) {
		
		Map<Integer, Boolean> map = new TreeMap<>();
		List<Integer> list = new ArrayList<>();
		
 		for(int i=0; i<arr.length;i++) {
			
			if(map.containsKey(arr[i])) {
				continue;
			}
			else {
				map.put(arr[i], true);
				list.add(arr[i]);
				
				
			}
		}
 		
		System.out.print(list);
	}

}
