package javaPackage;

public class unaryop1 {

	public static void main(String[] args) {
	 int a=10;// local variable 
	 int b=10;// local variable
	 System.out.println(a++); // 10, 11
	 System.out.println(a++ + ++a); // 11, 12, 13 //11+14=24
	 System.out.println(a ); // latest value of a=13
	 System.out.println(a + ++a);// 13,14 // 27
	 
	 System.out.println(b++ + b--);// incrementing value and decrementing value // 10,11,11,10 //10+11=21
	 System.out.println(b);// latest value of b=10.
	 

	}

}
