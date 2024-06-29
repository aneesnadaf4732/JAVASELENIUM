package javaPackage;

public class static5 {
	
	static int z=5;
	int y=1;
	
	
	public static void a() {
		z=10; //modifying the value of z
		System.out.println(z);
	}
	
	// non static method
	public void b() {
		z=15;
		System.out.println(z);// modifying the value of z
	}
	
	public static void main(String[] args) {
	
		a();
		static5 s5 = new static5();
	    s5.b();

	}

}
