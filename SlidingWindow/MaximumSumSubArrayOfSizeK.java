package SlidingWindow;

public class MaximumSumSubArrayOfSizeK {

	public static void main(String[] args) {
		
		int arr[] = {2,5,1,8,2,9,1};
		int k=3;
		int i=0;
		int j=0;
		
		
		int sum=0;
		int max = Integer.MIN_VALUE;
		
		while(j<arr.length) {
			
			//condition
			sum = sum + arr[j];
			
			if(j-i+1 <k) {
				j++;
			}
			else if(j-i+1 == k) {
				
				max = Integer.max(max, sum);
				
				sum = sum - arr[i];
				i++;
				j++;
				
			}
			
		}

		
		System.out.print(max);
	}

}
