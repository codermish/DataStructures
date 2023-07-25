package RecursionBasics;
import java.util.*;
public class PrintNameNTimes {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		
			int n= obj.nextInt();
			
			printName(n,1);
		
	}
	
	public static void printName(int n, int count) {
		
		if(count>n)
		{
			return;
		}
		
		
		System.out.println("Anugya");
		
		printName(n, count+1);
		
	}

}
