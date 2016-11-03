import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaBookProblem03 {

	public static void main(String[] args) {
		String text = "We <upcase>are</upcase> living in a <upcase>yellow submarine</upcase>. "
				+ "We don't have <upcase>anything</upcase> else.";

		Pattern p = Pattern.compile("<upcase>(.+?)</upcase>");
		Matcher m = p.matcher(text);
		List<String> wordsToUpper = new ArrayList<>();

		while (m.find()) {
			wordsToUpper.add(m.group(1));
		}

		for (int i = 0; i < wordsToUpper.size(); i++) {
			if (text.contains(wordsToUpper.get(i))) {
				text = text.replaceAll(wordsToUpper.get(i), wordsToUpper.get(i)
						.toUpperCase());
			}
		}
		System.out.println(text.replaceAll("<upcase>|</upcase>", ""));
	}

}
