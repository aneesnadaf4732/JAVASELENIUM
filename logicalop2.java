package javaPackage;

public class logicalop2 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		
		// logical op
		System.out.println(a < b && ++a < c);
		System.out.println(a);
		
		//bitwise op
		System.out.println(a < b & ++a < c);
		System.out.println(a);
	}

}

// logical op check the first condition if it is false then it will not check the second condition 