import java.util.Scanner;

public class PalindromeWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter some word:");
		String word = sc.next();
		boolean palindrome = false;

		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) == word.charAt((word.length() - 1) - i)) {
				palindrome = true;
			} else {
				palindrome = false;
				break;
			}
		}
		System.out.println(palindrome ? "The word is a palindrome"
				: "The word is not a palindrome");
		sc.close();
	}

}
