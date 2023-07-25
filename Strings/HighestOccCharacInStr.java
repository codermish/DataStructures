package Strings;

public class HighestOccCharacInStr {

	public static void main(String[] args) {
		
		String str = "aaaabbxxsss";
		char res = highestOccuringChar(str);
		
		System.out.print(res);

	}
public static char highestOccuringChar(String str) {
		
		int hash[] = new int[26];
		for(int i=0;i<str.length();i++){
			hash[str.charAt(i) - 'a']++;

		}
		int max = Integer.MIN_VALUE;
		int maxIndex = Integer.MIN_VALUE;
		
		for(int i=0;i<26;i++){
			if(max < hash[i]){
				max = hash[i];
				maxIndex = i;
			}
		}

		char res = (char) ('a' + maxIndex);
		return res;
	}

}
