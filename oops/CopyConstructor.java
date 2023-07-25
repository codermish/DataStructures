package oops;

public class CopyConstructor {

	
	String name;
	
	//constructor
	CopyConstructor(String name){
		this.name = name;
		System.out.println("constructor called");
	}
	
//	//copy constructor
//	CopyConstructor(CopyConstructor cc){
//		this.name = cc.name;
//		System.out.println("copy constructor called");
//	}
	
	public static void main(String args[]) {
		
		CopyConstructor c1 = new CopyConstructor("anugya");
		System.out.println("c1 old name " + c1.name);
	

//		CopyConstructor c2 = new CopyConstructor(c1);
//		System.out.println("c2 new name " + c2.name);
		
		CopyConstructor c2 = c1;
		System.out.println("c2 old name " + c2.name);
		c1.name = "mishu";
		System.out.println("c1 new name " +c1.name);
		System.out.println("c2 new name " + c2.name);

	}
	
}
