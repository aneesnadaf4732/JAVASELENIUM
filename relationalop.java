package javaPackage;

public class relationalop {

	public static void main(String[] args) {
		int a=300;
		int b=300;
		
		// comparing two integer 
		
		if (a != b) {
			System.out.println(" a is not equals to b ");
		
		}
		else {
			System.out.println("a and b are equal ");
		}
	String p="HELLO";
	String q="hello";
	
	// compare to strings in first way
	
	if (p == q) {
		System.out.println("p and q are equal");
	}
	else {
		System.out.println("p and q are not equal in first way");
	}
	
	// case sensitive strings p is in capital and q is in smaller 
	
	// compare string in second way
	if (p.equals(q)) {
		System.out.println(" p and q are equal in second way");
	}
	
	else {
		System.out.println("p and q are not equals in second way");
	}
	// comparing two string third way: correct way
	if (p.equalsIgnoreCase(q)) {
		System.out.println("p and q are equal in third way");
	}
	else {
		System.out.println("p and q are not equal in third way");
	}
	// in this statement we are ignoring the case sensitive, this is the correct way to compare strings
	}

}
