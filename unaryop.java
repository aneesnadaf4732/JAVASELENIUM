package javaPackage;

public class unaryop {

	public static void main(String[] args) {
		int a=1;
		System.out.println(a  ++); // 1,2
		System.out.println(a); //2
		System.out.println(a++); //2,3
		System.out.println(a); // 3
	
		System.out.println(++ a); // 4 Immediate increment of value 
		System.out.println(++a); //5  post increment
		System.out.println(a); // updated value 
	}

}
