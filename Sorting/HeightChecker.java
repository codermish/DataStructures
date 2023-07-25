package Sorting;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
				int heights[] = {1,1,4,2,1,3};
				
		        int arr[] = new int[heights.length];
		  
		        for(int i=0;i<heights.length;i++) {
		        	
		        	arr[i] = heights[i];
 		        }

		        
		        Arrays.sort(arr);
		        
		    
		     
		        
		        int count =0;
		        
		        for(int i=0;i<heights.length;i++){

		            if(heights[i] != arr[i]){

		                count++;
		            }

		        }


		       System.out.print(count);
		    }
	

	

}
