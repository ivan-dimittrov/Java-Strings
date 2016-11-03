import java.util.*;
public class BiggestNameByAsciiCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You have to enter some names separated by comma.");
		System.out.println("The program will return the biggest name by Ascii code.");
		System.out.println("-------------------------------------------------------");
		System.out.print("Please enter the names here: ");
		getBiggestNameByAsciiCode(sc.nextLine().split(","));
		sc.close();
		}
	
	public static void getBiggestNameByAsciiCode(String ... names) {
		int asciiSum = 0;
		String name = "";
		for (int i = 0; i < names.length; i++) {
			int sumOfChars = 0;
			char[] letters = names[i].toCharArray();
			for (int j = 0; j < letters.length; j++) {
				sumOfChars += letters[j];
			}
			if (sumOfChars > asciiSum) {
				asciiSum = sumOfChars;
				name = names[i];
			}
	    }
		System.out.println("Biggest name by Ascii code: " + name);
		System.out.println("Ascii code sum: " + asciiSum);
     }
  }
