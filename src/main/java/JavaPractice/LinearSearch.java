package JavaPractice;

public class LinearSearch {
	public static void main(String[] args) {
		int a[] = { 5, 7, 1, 2, 3, 8, 9, 4 };
		int k = 3;
		search(a,k);
	}
	
	public static void search(int a[], int k) {
		for(int i=0; i<a.length-1; i++) {
			if(a[i] == k) {
				System.out.println("Element present at: " +i+" index");
			}
		}
	}
}
