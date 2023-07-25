package Sorting;

import java.util.*;

public class SortThePeople {

	
	
	
	public static void main(String[] args) {

		
		
	String[] names = {"Mary","John","Emma"};
		
	int[] heights = {180,165,170};
	
	
	Map<Integer,String> map = new HashMap<>();
	
	for(int i=0;i<names.length;i++) {
		
		map.put(heights[i], names[i]);
	}
	
	Arrays.sort(heights);
	
	// 165, 170, 180
	
	
	for(int i=0;i<heights.length;i++) {
		
	names[i] = map.get(heights[i]);
	}
	
	
	for(int i=0;i<names.length;i++) {
		System.out.print(names[i] +" ");
	}
	
	
	
	
	
	
		
		
	}
}
