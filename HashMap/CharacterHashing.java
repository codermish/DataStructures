package HashMap;

public class CharacterHashing {
	
	public static void main(String[] args) {

	
		//character hashing
		
		String str = "anugya";
		
		//array to store all characters
		int arr[] = new int[26];
		
		for(int i=0;i<str.length();i++) {
			
			arr[str.charAt(i) - 'a']++;
			
		}
		
	for(int i=0;i<str.length();i++) {
			
			System.out.println(str.charAt(i) +"  " +  arr[str.charAt(i) - 'a']);
			
		}
		
		
		
		
	}

}
