package JavaPractice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 5, 7, 1, 2, 3, 8, 9, 4 };
		int n = a.length-1;
		recursiveBubbleSort(a, n);
		System.out.println("Sorted array :" + Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

	}

	//if array is sorted, this method will not process after first traversal through the array
	public static void bubbleSortImproved(int[] a) {
		boolean swapped = true;
		for (int i = 0; i < a.length; i++) {
			swapped = false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}

	}
	
	public static void recursiveBubbleSort(int[] a, int n) {
				
		for(int i=0; i<n;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
			recursiveBubbleSort(a, n-1);
		}
	}

}
