package HashMap;

public class MaximumOccCharacter {
	
	public static void main(String args[]) {
		
		
		
		String str = "aaabbcdefffffff";
		
		int hash[] = new int[26];
		
		for(int i=0; i< str.length();i++) {
			
			hash[str.charAt(i) -'a']++;
		}
		
		System.out.println("hash array is:");

		for(int i=0;i<26;i++) {
			System.out.print(hash[i] +" ");
		}
		
		
		System.out.println();
		
		int max = Integer.MIN_VALUE;
		char charMax = 0;
		
		for(int i=0;i<hash.length;i++) {
			if(max < hash[i]) {
				max = hash[i];
				charMax  = (char) (i + 'a');
			}
		}
		
		System.out.println("max occ character is " +charMax);
		
		
	}

}
