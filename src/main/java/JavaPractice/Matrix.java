package JavaPractice;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {

		System.out.println("Welcome to Java program to transpose a Matrix");
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter details of matrix");
		System.out.print("Please Enter number of rows: ");
		int row1 = scnr.nextInt();
		System.out.print("Please Enter number of columns: ");
		int column1 = scnr.nextInt();
		System.out.println();
		System.out.println("Enter first matrix elements");
		Matrix m = new Matrix();
		MatrixOperation first =m.new MatrixOperation(row1, column1);
		first.read(scnr);

		System.out.println("original matrix: ");
		first.print();
		first.transpose();
	}
	
	class MatrixOperation {
		  private int rows;
		  private int columns;
		  private int[][] data;
		  
		  
		  public MatrixOperation(int rows, int columns) {
			super();
			this.rows = rows;
			this.columns = columns;
			data = new int[rows][columns];
		}


		public void read(Scanner sc) {
			  for(int i=0; i<rows; i++) {
				  for(int j=0; j<columns; j++) {
					  data[i][j] = sc.nextInt();
				  }
			  }
		  }
		
		public void print() {
			for(int i=0; i<rows; i++) {
				  for(int j=0; j<columns; j++) {
					  System.out.print(data[i][j]+ " ");
				  }
				  System.out.println();
			  }
		}
		
		public void transpose() {
			int[][] temp = new int[columns][rows];
			for(int i=0; i<rows; i++) {
				  for(int j=0; j<columns; j++) {
					  temp[j][i] = data[i][j];
				  }				  
			  }
			data = temp;
			print();
		}
	}
}
