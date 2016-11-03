
public class JavaBookProblem02 {

	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything else. "
				+ "Inside the submarine is very tight. "
				+ "So we are drinking all the day. We will move out of it in 5 days.";
		text = text.toLowerCase();
		String searchedWord = "in";
		int index = text.indexOf(searchedWord);
		
		if (index == -1) {
			System.out.println("The word is not found");
		}else {
			int result = 1;
			
			while (index != -1) {
				index = text.indexOf(searchedWord, index + 1);
				if (index != -1) {
					result++;
				}
			}
			
			System.out.println("Searched word occurs " + result + " times");
		}
	}
}
