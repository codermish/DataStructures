package Strings;

public class CheckIf2StringsArePrmuOfEachOther {

	public static void main(String[] args) {
		
		
		String str1 = "race";
		String str2 = "rate";
		boolean ans = true;
		
		if(str1.length() != str2.length()) {
			ans = false;
		}
		else {
			int hash[] = new int[256];
			
			for(int i=0;i<str1.length();i++) {
				hash[str1.charAt(i)]++;
				
			}
			
			for(int i=0;i<str2.length();i++) {
				hash[str2.charAt(i)]--;
				
			}
			
			
			for(int i=0;i<256;i++) {
				
				if(hash[i] != 0) {
					ans = false;
					break;
				}
				
				
			}
		}
		
		
		
		System.out.print(ans);

	}

}
