package RecursionBasics;
import java.util.Scanner;


public class SumOfNnumberUsingFunc {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		int sum = findSum(n);
		
		System.out.print(sum);
		

	}
	
	public static int findSum(int num) {
		
		if(num ==0) {
			return 0;
		}
		
		return num + findSum(num-1);
		
	}

}
