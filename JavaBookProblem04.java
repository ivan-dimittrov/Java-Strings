public class JavaBookProblem04 {

	public static void main(String[] args) {
		String text = "Microsoft announced its next generation Java compiler today. "
				+ "It uses advanced parser and special optimizer for the Microsoft JVM.";

		String[] swearWords = "Java JVM Microsoft".split(" ");

		for (int i = 0; i < swearWords.length; i++) {
			if (text.contains(swearWords[i])) {
				String repeated = new String(new char[swearWords[i].length()])
						.replace("\0", "*");
				text = text.replaceAll(swearWords[i], repeated);
			}
		}
		System.out.println(text);

	}
}
