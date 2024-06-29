package javaPackage;

public class Array {

	public static void main(String[] args) {
		// we can create arrays as below (single dimensional array)
		int b[]= {1,2,3,4,5};
		String s[]= {"HELLO", "JAVA", "SELENIUM",};// defining string array
		Object a[]= {1,2,3,4,5,"anees",10.5,'a'};
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		System.out.println(s[1]);//java
		System.out.println(a[5]);
		s[2]="automation";// modification 
		System.out.println(s[2]);
	}

}
