
package JavaPractice;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

class BalancedBrackets {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Character> parentMap = new HashMap<Character, Character>();
		parentMap.put('(', ')');
		parentMap.put('{', '}');
		parentMap.put('[', ']');
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(balanced(input, parentMap) ? "true" : "false");
		}
		// Complete the code
	}

	private static boolean balanced(String exp, HashMap<Character, Character> parentMap) {
		if (exp.length() % 2 != 0) {
			return false;
		}
		ArrayDeque<Character> deque = new ArrayDeque<>();
		for (int i = 0; i < exp.length(); i++) {
			Character ch = exp.charAt(i);
			if (parentMap.containsKey(ch)) {
				deque.push(ch);
			} else if (deque.isEmpty() || ch != parentMap.get(deque.pop())) {
				return false;
			}
		}
		return deque.isEmpty();
	}
}
