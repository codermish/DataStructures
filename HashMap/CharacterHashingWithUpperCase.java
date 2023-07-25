package HashMap;

public class CharacterHashingWithUpperCase {
	
	public static void main(String args[]) {
		
		
		String str = "ABBcabdds";
		
		int arr[] = new int[256];
		
		
		for(int i=0;i<str.length();i++) {
			
			arr[str.charAt(i)]++;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			System.out.println(str.charAt(i) + " " + arr[str.charAt(i)]);
		}
		
		
		
		
		
	}

}
