package JavaPractice;

public class Palindrome {
	public static void main(String[] args) {

		String input = "Samyak Jain";
		
		for(int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
		System.out.println();
		String[] s = input.split(" ");
		for(int i=s.length-1; i>=0; i--) {
			System.out.print(s[i]+ " ");
		}
		System.out.println();
		StringBuilder sb = new StringBuilder(input);
		System.out.println(sb.reverse());
	}
}
	
	
