package HashMap;
import java.util.*;
import java.util.Map.Entry;
public class MaximumOccuringWorkInSentence {

	public static void main(String[] args) {
		
		String str = "My name is Anugya Sharma, Anugya Anugya Senior Software ENGINEER";
		
		String arr[] = str.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i< arr.length; i++) {
			
			if(map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i])+1 );
			}
			else {
				
				map.put(arr[i], 1 );
			}
			
			
		}
		
		int max = Integer.MIN_VALUE;
	    String word ="";
	    
	    for(Entry<String,Integer> entry : map.entrySet()) {
	    	
	    	if(max < entry.getValue()) {
	    		max = entry.getValue();
	    		word = entry.getKey();
	    	}
	    	
	    }
	    
	    System.out.print(word +" " +max);
		

	}

}
