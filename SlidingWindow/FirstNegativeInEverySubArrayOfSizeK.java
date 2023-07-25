package SlidingWindow;
import java.util.*;


public class FirstNegativeInEverySubArrayOfSizeK {

	public static void main(String[] args) {
		
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int k=3;		
		LinkedList<Integer> list = new LinkedList<>();
		List<Integer> ans = new ArrayList<>();		
		int i=0;
		int j=0;
		
		while(j<arr.length) {
			
			//calculation
			if(arr[j] <0) {
				list.add(arr[j]);				
			}
			
			if(j-i+1 <k) {
				j++;
			}
			else if(j-i+1 == k) {
				
				if(list.size()==0) {					
					ans.add(0);
					i++;
					j++;
				}
				else {				
					ans.add(list.peek());
					if(list.peek() == arr[i]) {
						list.pop();
					}					
					i++;
					j++;					
				}				
			}		
		}
		
		System.out.print(ans);

	}

}
