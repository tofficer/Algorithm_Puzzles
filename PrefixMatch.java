import java.util.*;


class PrefixMatch {

	public static void main(String[] args) {
		ArrayList<String> dict = new ArrayList<>();
		dict.add("apple");
		dict.add("app");
		dict.add("pear");
		dict.add("bannana");
		String prefix = "ap";

		String s = prefixMatch(dict, prefix);
		System.out.println(s);

	}

	public static String prefixMatch(ArrayList<String> dict, String prefix) {

		int n = prefix.length();
		String best_match = "";

		for (String s : dict) {
			if (s.length() < n) continue;
			if (s.substring(0, n).equals(prefix)) {
				if (s.length() < best_match.length() || best_match.equals("")) {
					best_match = s;
				}
			}
		}

		return best_match;

	}

}