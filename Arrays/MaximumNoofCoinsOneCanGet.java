package Arrays;

import java.util.*;

public class MaximumNoofCoinsOneCanGet {

	public static void main(String[] args) {
		
		
		int piles[] = {9,8,7,6,5,1,2,3,4};
		
		Arrays.sort(piles);
		
		int sum=0;
		int start =0;
		int end = piles.length -1;
		
		while(start<end) {
			List<Integer> list = new ArrayList<>();

			list.add(piles[end]);
			list.add(piles[end-1]);
			list.add(start);
			
			Collections.sort(list);
			
			sum = sum + list.get(1);
			
			start++;
			end= end -2;
			
			
			
		}
		
		System.out.print(sum);

	}

}
