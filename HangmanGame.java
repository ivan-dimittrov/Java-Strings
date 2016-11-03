import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] secretWords = { "HangmanGame", "Word", "Game", "Programming",
				"Bus", "Computer", "Notebook", "Beer", "Beard", "Bear" };
		Random r = new Random();
		int position = r.nextInt(secretWords.length);
		String secretWord = secretWords[position].toLowerCase();
		String str = "";
		char[] arr = new char[secretWord.length()];

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = secretWord.charAt(0);
			} else if (i == arr.length - 1) {
				arr[i] = secretWord.charAt(i);
			} else {
				arr[i] = '_';
			}
		}

		System.out.println("Searched word:");
		for (char c : arr) {
			System.out.print(c + " ");
		}
		System.out.println();
		char input;
		int tryesLeft = 6;

		do {
			System.out.print("Enter a letter: ");
			input = sc.nextLine().charAt(0);
			int index = secretWord.indexOf(input);
			if (index == -1) {
				tryesLeft--;
				System.out.println("Wrong choice.. You have " + tryesLeft
						+ " tryes left");
			} else {
				for (int i = index; i < secretWord.length(); i++) {
					if (input == secretWord.charAt(i)) {
						arr[i] = input;
					}
				}

				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				str = new String(arr);
				if (str.equals(secretWord)) {
					break;
				}

			}

		} while (tryesLeft > 0);
		sc.close();
	}
}

