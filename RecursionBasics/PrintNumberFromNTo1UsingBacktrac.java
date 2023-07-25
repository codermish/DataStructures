package RecursionBasics;

import java.util.Scanner;

public class PrintNumberFromNTo1UsingBacktrac {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		print(1,n);
		

	}
	
	public static void print(int val,int n) {
		
		if(val>n) {
			return;
		}
		
		print(val+1,n);
		
		System.out.print(val+" ");
	}

}
