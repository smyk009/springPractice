package JavaPractice;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {5,7,1,2,3,8,9,4};
		quickSort(a, 0, a.length-1);
		 System.out.println("Sorted array :" + Arrays.toString(a));
	}
	
	private static void quickSort(int a[], int low, int high) {
		int i = low;
		int j = high;
		
		int pivot = a[(low + (high-low)/2)];
		
		while(i<=j) {
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<=j) {
				swap(a,i,j);
				i++;
				j--;
			}
		}
		
		if(low<j) {
			quickSort(a, low, j);
		}
		
		if(i<high) {
			quickSort(a, i, high);
		}
	}
	
	private static void swap(int a[],int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
}
