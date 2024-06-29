package javaPackage;

public class logicalop {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		 
		
		// logical operator 
		System.out.println(a > b && a < c); // false // a>b true
		System.out.println(a < c && a > b); // first condition is false so it will be false in the logical op
		System.out.println(a > b && b > c); //
		// True false
		
		//bitwise operator 
		
		System.out.println(a < b & a < c); // false 
		System.out.println(a>b & b>c);
	}

}


// > greater 
// < lesser