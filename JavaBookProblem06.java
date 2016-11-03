import java.util.*;
public class JavaBookProblem06 {
	// Reverse string
	// Example: C# is not C++ and PHP is not Delphi -> 
	// Delphi not is PHP and C++ not is C#.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some text: ");
		String text = sc.nextLine();
		String[] reversed = text.split(" ");
		
		for (int i = reversed.length - 1; i >= 0 ; i--) {
			System.out.print(reversed[i] + " ");
		}
		sc.close();
	}

}
