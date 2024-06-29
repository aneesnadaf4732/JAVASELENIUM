package javaPackage;

public class unaryop2 {

	public static void main(String[] args) {
		int x=5;
		int y=5;// local variable
		System.out.println(x++);// 5,6
		System.out.println(x);//6 
		System.out.println(++x);// 7
		System.out.println(x++ + ++x); //7, 8, 9 // 8+9=16
		System.out.println(++y); //5,6
		System.out.println(y);// 6
		System.out.println(y++ + ++y);//6, 7, 8 // 6+8=14
		System.out.println(y);//8

	}

}
