package JavaPractice;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int a[] = { 5, 7, 1, 2, 3, 8, 9, 4 };

		// int n = a.length-1;
		reverseArrayInPlace(a);
		System.out.println("Reversed array :" + Arrays.toString(a));
	}
	
	public static void reverseArrayInPlace(int[] a) {
		int size = a.length-1;
		for(int i=0; i<size; i++) {
			int temp = a[i];
			a[i] = a[size];
			a[size] = temp;
			size--;
		}
	}
}
