package RecursionBasics;

import java.util.Scanner;

public class PrintLinearlyFromNTO1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		print(n,n);
		
		

}
	
	
	public static void print(int val, int n) {
		
		if(val==0) {
			return;
			
			
		}
		
		System.out.print(val+" ");
		
		print(val-1, n);
	}
	
	
	
	
	
	
}

