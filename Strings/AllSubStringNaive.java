package Strings;

public class AllSubStringNaive {

	public static void main(String[] args) {
		
		
		String str = "anugya";
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i;j<str.length();j++) {
				
				System.out.print(str.substring(i, j+1)+" ");
				
				
			}
			
			
		}
		
		
	}

}
