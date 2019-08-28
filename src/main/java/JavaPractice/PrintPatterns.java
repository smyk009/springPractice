package JavaPractice;

public class PrintPatterns {

	public static void main(String[] args) {

		printFloydTriangle(4);
		pyramid(6);
		System.out.println();
		printHalfStar(6);
		invertedHalfStar(6);
	}

	public static void printFloydTriangle(int rows) {
		int number = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}

	public static void pyramid(int rows) {
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printHalfStar(int rows) {
		for (int i = 0; i <= rows; i++) {
			if (i < rows / 2) {
				for (int j = 0; j <=i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = i; j<=rows; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void invertedHalfStar(int rows) {
		for(int i=0; i<=rows; i++) {
			if(i<=rows/2) {
				for(int k=0; k<=rows-i; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j=0; j<=i; j++) {
					System.out.print(" ");
				}
				for(int k=i; k<=rows; k++) {
				System.out.print("*");	
				}
				
			}
			System.out.println();
		}
	}

}
