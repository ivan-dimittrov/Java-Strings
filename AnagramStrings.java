import java.util.Scanner;
public class AnagramStrings {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("First sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Second sentence: ");
		String sentence2 = sc.nextLine();
		
		sentence = sentence.replaceAll("[^ a-zA-Z]", "");
		sentence2 = sentence2.replaceAll("[^ a-zA-Z]", "");
		
		boolean isAnagram = true;
		
		for (int i = 0; i < sentence.length(); i++) {
			int index = sentence2.indexOf(sentence.charAt(i));
			if (index == -1) {
				isAnagram = false;
				break;
			}
		}
		
		if (isAnagram) {
			System.out.println("The strings are anagrams");
		} else {
			System.out.println("The strings are not anagrams");
		}
		sc.close();
	}

}
