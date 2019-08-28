package JavaPractice;

public class StringReverse {
	public static void main(String[] args) {

		String input = "Samyak Jain";
		char c = input.charAt(0);
		if(Character.isDigit(c)) {
			System.out.println("Digit");
		} else if(Character.isLetterOrDigit(c)) {
			System.out.println("Letter or digit");
		}

		System.out.println(reverse(input));
	}

	static String reverse(String str) {
		if (str.length() < 2) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);

	}

}
