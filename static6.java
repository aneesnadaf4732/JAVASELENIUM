package javaPackage;

public class static6 {
	int x=10;// global variable 
	static int y= 6; //static variable
	
	// user defined non static method.
	public void a() {
		int z=10; // local variable 
		System.out.println(z);
	}
	
	static int b=100;
	// main method
	public static void main(String[] args) {
		static6 s1 = new static6();
		s1.a();
		System.out.println(s1.b);// not appropriate way
		System.out.println(b);// correct way
		System.out.println(static6.b);//not correct
	}

}
