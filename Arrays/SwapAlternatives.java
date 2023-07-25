package Arrays;

public class SwapAlternatives {
	
	
	public static void main(String args[]) {
		
		
		int arrOdd[] = {10,50,26,65,21,45,66};
		int arrEven[] = {10,50,26,65,77,78};
		
		 swapAlternative(arrOdd);
		 swapAlternative(arrEven);
		
		for(int i=0; i<arrOdd.length;i++) {
			System.out.print(arrOdd[i] +" ");
		}
		
		
		for(int i=0; i<arrEven.length;i++) {
			System.out.print(arrEven[i] +" ");
		}
		
	}
	
	public static int[] swapAlternative(int[] arr) {
		
		for(int i=0; i<=arr.length;i=i+2) {
			
			if(i+1 < arr.length) {
				
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
	
		
		}
		
		return arr;
		
	}
	

}
