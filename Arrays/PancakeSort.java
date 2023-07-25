package Arrays;

import java.util.*;

public class PancakeSort {

	public static void main(String[] args) {
	
		int arr[] = {4,5,2,1,3,6};	
		pancakeSort(arr);
		
		for(int i=0;i<arr.length;i++) {			
			System.out.print(arr[i] +" ");
		}
		

	}

	 public static void pancakeSort(int[] arr) {      	     
	        int last = arr.length-1;
	        while(last> 0){
	        int maxIndex = maxEleIndex(arr, last);
	        reverse(arr, maxIndex);
	        reverse(arr, last);
	        last--;
	        }
	    }


	    public static int maxEleIndex(int[] arr, int lastIndex){
	        int max = Integer.MIN_VALUE;
	        int maxIndex = 0;
	        for(int i=0;i<=lastIndex;i++){
	            if(arr[i] > max){
	                max = arr[i];
	                maxIndex=i;
	            }
	        }
	        return maxIndex;
	    }

	    public static void reverse(int[] arr, int index){
	        int i=0;
	        while(i < index){
	            int temp = arr[i];
	            arr[i] = arr[index];
	            arr[index] = temp;
	            i++;
	            index--;	           
	        }
	    }
}
