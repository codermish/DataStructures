package Sorting;

public class DeleteGreatestValueInEachRow {

	public static void main(String[] args) {
		
		
		int arr[][]  = {{1,2,4},{3,3,1}};
		
		System.out.println("find max in each row");
		
		
		
		
		for(int i=0;i<arr.length;i++) {
			int max = Integer.MIN_VALUE;
			
			for(int j=0;j<arr[0].length;j++) {
				
				if(max < arr[i][j]) {
					max = arr[i][j];
					
				}
				
				
			}
			
			System.out.println(max);
		}
		
		

	}

}
