package Arrays;

public class ClasObj {

	public static void main(String[] args) {
		
		
		int arr[] = {3,5,6};
		change(arr);
		
	for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			
			
		}
		
		

	}
	
	public static void change(int[] num) {
		
		num = new int[5];
		
		for(int i=0;i<num.length;i++) {
			
			num[i] = num[i]+1;
			
			
		}
	}

}
