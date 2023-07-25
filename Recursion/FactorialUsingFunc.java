package Recursion;

import java.util.Scanner;

public class FactorialUsingFunc {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);

		int num = obj.nextInt();
		
		int val = fact(num);
		
		System.out.print(val);
		

	}
	
	
	public static int fact(int num) {
		
		if(num == 1) {
			return 1;
		}
		
		return  num*fact(num-1);
		
		
		
	}

}
