package javaPackage;

public class brakest {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			
			//if statement 
			if(i == 5) {
				break;
			}
		}
		System.out.println("control came out of loop");
	}

}
