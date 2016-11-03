import java.util.*;
public class ReplaceFirstFiveLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words bigger than five letters:");
		String word1;
		String word2;
		
		do {
			System.out.print("First word: ");
			word1 = sc.nextLine();
			System.out.print("Second word: ");
			word2 = sc.nextLine();
			if (word1.length() < 6 || word2.length() < 6) {
				System.out.println("You have to enter two words bigger than five letters!");
			}
		} while (word1.length() < 6 || word2.length() < 6);
		
		String result = "";
		
		if (word1.length() > word2.length()) {
			result = word1.replace(word1.substring(0,6), word2.substring(0,6));
		}else {
			result = word2.replace(word2.substring(0,6), word1.substring(0,6));
		}
		System.out.println("New word -> " + result);
		sc.close();
	}

}
