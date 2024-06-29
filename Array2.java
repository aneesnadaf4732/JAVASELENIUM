package javaPackage;

public class Array2 {

	public static void main(String[] args) {
		
		// define multidimensional array
	
		int a[][]={{1,2,3,4},{5,6,7,8},{0,9,8,1}};
		
		// total no of rows 
		
		//for calculation of rows
		
		int row = a.length;
		System.out.println("total number of rows are: "+row);
		
		// for calculation of column
		
		int column = a[0].length;
		System.out.println("total number of column are: "+column);
		// print all the data
		
		//outer loop
		for(int i=0; i < row; i++) {
			//inner loop
			for(int j=0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
