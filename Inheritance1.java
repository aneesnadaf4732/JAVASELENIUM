package javaPackage;

public class Inheritance1 extends Inheritance{

	// child class : class properties parent class
	
	int b=10;
	
	public static void main(String[] args) {
		
		Inheritance1 v2 = new Inheritance1();
		System.out.println(v2.b);
		System.out.println(v2.a);
		java();
		//selenium(); // private method does not extends
		
	}

}
