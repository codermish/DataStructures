package HashMap;
import java.util.Scanner;
public class HashMapDemo {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("enter arr size");
		int num = obj.nextInt();
		
		System.out.println("enter array");
		int arr[] = new int[num];
		for(int i=0;i<num;i++) {
			
			arr[i]= obj.nextInt();
		}
		
		System.out.println("enter the number u want to find freq till");
		int n = obj.nextInt();
		
		//creating a hash and storing values till expected freq
		int hash[] = new int[n+1];
		
		for(int i=0;i<n;i++) {
			hash[i]=0;
		}
		
		//updating the hash as value from array comes
		for(int i=0;i<num;i++) {
			hash[arr[i]] = hash[arr[i]]+ 1;
		}
		
	for(int i=0;i<n;i++) {
			
		System.out.print(hash[i]+" ");
		}
				
		
		
	}

}
