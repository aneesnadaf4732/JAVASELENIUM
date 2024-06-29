package javaPackage;

public class variable7 {
	int b=10;// global variable 
	static int c=5;// static 
	
	public static void main(String[] args) {
	 int a=6;
	 System.out.println(a); // calling local variable
	
	 System.out.println(c);// calling static variable 
	variable7 v7 = new variable7();
	System.out.println(v7.b);
	a();
	}
public static void a() {
	int f= 15;
	System.out.println(f);
}
}