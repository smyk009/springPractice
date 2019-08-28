package JavaPractice;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = { 5, 7, 1, 2, 3, 8, 9, 4 };
		//int n = a.length-1;
		insertionSort(a);
		System.out.println("Sorted array :" + Arrays.toString(a));
	}
	
	public static void insertionSort(int[] a) {
		for(int i=1; i<a.length; ++i) {
			int key = a[i];
			int j= i-1;
			
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key; 
		}
	}
}
