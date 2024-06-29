package javaPackage;

public class IFELSENEST {

	public static void main(String[] args) {
	int age= 20;
	int weight= 49;
	
	//nested of statement: two blocks  inner and outer block
	
	// outer block 
	if (age > 18) {
		//inner block
		if (weight > 50) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("not eligible");
		}
		
	}
	else {
		System.out.println("age or weight does not match ");
	}
	}

}
