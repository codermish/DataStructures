package RecursionBasics;

import java.util.Scanner;


public class PrintFrom1ToNUsingBackTracking {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		//here we dont have to use val+1
		
		printByBacktrack(n,n);
		
		
		
		

	}
	
	
	public static void printByBacktrack(int val, int n) {
		
		if(val==0) {
			return;
		}
		
		printByBacktrack(val-1,n);
		
		//we acheived backtracking by printing the number after exe
		System.out.print(val+" ");
		
		
		
		
	}

}
