package HashMap;
import java.util.*;

public class NumberHashingUsingMap {

	public static void main(String[] args) {
		
		
		int arr[] = {2,4,2,6,7,8,10,12};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], null);
		}
		

	}

}
