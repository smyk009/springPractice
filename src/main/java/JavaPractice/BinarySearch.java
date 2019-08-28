package JavaPractice;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 5, 7, 1, 2, 3, 8, 9, 4 };
		int n = a.length - 1;
		int result = search(a, 0, n, 8);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	public static int search(int a[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (a[mid] == x) {
				return mid;
			}
			if (a[mid] > x) {
				return search(a, l, mid - 1, x);
			} else {
				return search(a, mid + 1, r, x);
			}
		}
		return -1;
	}
}
