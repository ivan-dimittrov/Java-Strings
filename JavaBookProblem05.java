import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaBookProblem05 {

	public static void main(String[] args) {
		String url = "http://www.devbg.org/forum/index.php";
		Pattern p = Pattern.compile("(http):\\/\\/(\\w+.\\w+.\\w+)(\\/.+)");
		Matcher m = p.matcher(url);
		
		while (m.find()) {
			System.out.println("[protocol]= " + m.group(1));
			System.out.println("[server]= " + m.group(2));
			System.out.println("[resource]= " + m.group(3));
		}

	}

}
