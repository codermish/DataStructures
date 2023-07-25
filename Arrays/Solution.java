package Arrays;
import java.util.*;
import java.util.Map.Entry;


class Solution {
	
	
	public static void main(String args[]) {
		
		
		int arr[] = {3,5,2,3};
		
		int res = minPairSum(arr);
		
	
			System.out.print(res +" ");
		
		
	}
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
int i=0;
int j = nums.length -1;

while(i<j){

if(nums[i] == nums[j] && Math.abs(i-j) <=k){

return true;


}
i++;
j--;

}
        
return false;

    }
    
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> res = new ArrayList<>();

        int index=0;
        
        while(index<l.length) {
        	
        	int start = l[index];
        	int end =   l[index];
        	
        	Arrays.sort(nums, start, end);
        	
        	int sub = Math.abs(nums[1] - nums[0]);
        	
        	for(int i= start+1;i<end;i++ ) {
        		
        		if(nums[i] - nums[i-1] != sub) {
        			res.add(false);
        			break;
        		}
        		
        		
        		
        		
        	}
        	
        	if(res.isEmpty() || res.size()<index+1) {
        		res.add(true);
        	}
        	
        	
        	
        	index++;
        	
        }

        return res;
    }
	   
	   public static int minPairSum(int[] nums) {
	        Arrays.sort(nums);

	        int i=0;
	        int j = nums.length -1;
	        int max = Integer.MIN_VALUE;

	        while(i<j){

	            max = Integer.max(max, nums[i] + nums[j]);
	            i++;
	            j--;


	        }

	return max;

	    }

	

	    }
            
        
         
    

  

         
    

  
