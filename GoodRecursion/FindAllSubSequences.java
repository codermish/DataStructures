package GoodRecursion;
import java.util.*;

public class FindAllSubSequences {

	public static void main(String[] args) {
		
		int arr[] = {3,2,1};
		List<Integer> list = new ArrayList<>();
		getAllSub(0,arr,list);
		

	}
	
	
	public static void getAllSub(int index, int[] arr, List<Integer> res) {
		
		if(index == arr.length) {
		
			System.out.print(res+", ");
			return;
		}

			res.add(arr[index]);
			
			getAllSub(index+1, arr, res);

			res.remove(res.size()-1);
			
			getAllSub(index+1, arr, res);;
			
			
			
		}
		
		
		
		
		
	}


