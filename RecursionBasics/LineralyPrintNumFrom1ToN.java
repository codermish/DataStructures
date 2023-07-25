package RecursionBasics;
import java.util.*;



public class LineralyPrintNumFrom1ToN {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		print(1,n);
		
		

	}

	public static void print(int val, int n) {
		
		if(val>n) {
			return;
			
			
		}
		
		System.out.print(val+" ");
		
		print(val+1, n);
	}
}
