package javaPackage;

public class static7 {
	String a; // declaring a global variable 
	int b; // declaring a global variable 
	static int c=4; //static variable 
	
	public static void a() {
	System.out.println("hello static members");	
	}
	

	public static void main(String[] args) {
		static7 s7 = new static7();
		s7.a="Selenium";
		s7.b=100;
		c=6;
		System.out.println(s7.a+" "+ s7.b+" "+c);
		a();
	}

}
