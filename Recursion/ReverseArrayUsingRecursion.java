package Recursion;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {
		
		int arr[] = {1,4,3,2,6,8};
		
		arr = rev(arr,0,arr.length-1);
		
		System.out.println("reversed array is:");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}
	
	
	public static int[] rev(int arr[], int left, int right) {
		
		if(left>right) {
			
			return arr;
		}
		
		//swap first and last
		
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		return rev(arr,left+1,right-1);
		
	}

}
