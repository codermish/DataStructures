package oops;

import Stack.*;

public class AccessModifiers {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		Mobile anugya = mobile;
		System.out.println(mobile.colour);
		System.out.println(mobile.modelNo);
		

	}

}
