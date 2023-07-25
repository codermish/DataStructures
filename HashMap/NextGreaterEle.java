package HashMap;
import java.util.*;
import java.util.Map.Entry;
public class NextGreaterEle {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		Map<Integer, Integer> mapRes = new HashMap<>();

		map.put(0, 4);
		map.put(1, 1);
		map.put(2, 0);
		map.put(3, 5);
		map.put(4, 2);
		map.put(5, 3);
		map.put(6, 25);


				
		List<Integer> aList = new ArrayList<>();
		List<Integer> res = new ArrayList<>();

		aList.add(4);
		aList.add(1);
		aList.add(0);
		aList.add(5);
		aList.add(2);
		aList.add(3);
		aList.add(25);
		
		int index= 0;
		int prev = map.get(index);
		Stack<Integer> st = new Stack<>();
		
		boolean firstGreater = false;
		int lastPrev = 0;
		
		for(Integer val : aList) {
			
			if(firstGreater) {
				
			while(!st.isEmpty()) {
			
				if(!mapRes.containsKey(st.peek())) {
					
					mapRes.put(st.peek(),  map.get(lastPrev));
				}
				
				
				st.pop();
			
			}
			
			
		
			}
			
			else {
				if(val > prev) {
					
					mapRes.put(prev, val);
					
					index++;		
					prev = map.get(index);
					
					firstGreater = true;
					
					
					}
					
					else {
						
						st.push(val);
					
						
						
						
					}
			}
			
		
			
			
			
		}
		
		
		
		for(Entry<Integer, Integer> entry: mapRes.entrySet()) {
			System.out.println(entry.getKey() +" " + entry.getValue());
		}
		
		
		
		
		

	}

}
