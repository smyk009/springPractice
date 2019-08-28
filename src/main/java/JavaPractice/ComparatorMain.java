package JavaPractice;

import java.util.Arrays;

public class ComparatorMain {

	public volatile int[] a = new int[4];
	int d;
	byte c = (byte) d;
	public static void main(String[] args) {
		Employee[] empArr = new Employee[2];
		empArr[0] = new Employee(1, "Sharma");
		empArr[1] = new Employee(2, "Verma");
		
		int[] arr = new int[4];
			
		Arrays.sort(empArr, new EmployeeComparator());
		System.out.println(Arrays.toString(empArr));
		
		
	}
}
