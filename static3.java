package javaPackage;

public class static3 {
	int roll;
	String name;
	static String Collage="IIT DELHI";
	
	// constructor 
	
	static3(int r, String n){
	roll=r;
	name=n;

}
	public void getResult() {
		System.out.println(roll+" " + name+"  " + Collage+"  ");
	}
}