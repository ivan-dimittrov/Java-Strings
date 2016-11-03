import java.util.*;
public class JavaBookProblem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word that you want to reverse: ");
		String str = sc.nextLine();
		StringBuilder reverse = new StringBuilder();
		
		for (int i = str.length() -1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		System.out.println("Reversed: " + reverse);
		sc.close();
	}

}
