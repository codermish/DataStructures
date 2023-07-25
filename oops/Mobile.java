package oops;

public class Mobile {

int modelNo;
String colour;

	Mobile(){
	
		System.out.println("Default Constructor called " +this);
	}
	
	
	Mobile(int modelNo, String colour){
		this.colour = "red";
		
		System.out.println("Parameterized Constructor called " +this);
	}
}
