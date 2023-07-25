package HashMap;

import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndLinkedHashMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		Map<String, String> map2 = new TreeMap<String, String>();
		
//		int arr[] = {2,2,2,1,3,4,4,4};
//		for(int i=0;i<arr.length;i++) {
//			
//			if(map.get(arr[i]) != null) {
//				map.put(arr[i], map.get(arr[i]) +1);
//			}
//			else {
//				
//				map.put(arr[i], 1);
//			}
//					
//		}
//		
//		int max_count = 0;
//		int res = -1;
//		
//		for(Entry<Integer, Integer> val : map.entrySet())
//        {
//            if (max_count < val.getValue())
//            {
//                res = val.getKey();
//                max_count = val.getValue();
//            }
//        }
//		
//		System.out.print(res);
		
		map.put("item1", "video1");
		map.put("item2", "video2");
		map.put("item3", "video3");
		map.put("item4", "video4");
		map.put("item5", "video5");
		
		map2.put("item", "video");
		map2.put("item1", "video1");
		map2.put("item2", "video2");
		map2.put("item3", "video3");
		map2.put("item4", "video4");
		map2.put("item5", "video5");
		

		
		for(String video : map.values()) {
			
			System.out.print(video+" ");
			
		}

		System.out.println();
		
	for(String video : map2.values()) {
			
			System.out.print(video+" ");
			
		}
		
	}

}
