package ques4;

public class Source {
	public static String trimAndConcat(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		s1 = s1 + s2;
		return s1;
	}

	public static Integer getIndexOrNull(String s, char c) {

		Integer index = null;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				index = s.indexOf(c);
			}
		}

		return index;
	}

	public static String padPrint(String inputStr, int n) {
		String padPrint = "";
		for (int i = 0; i < inputStr.length(); i++) {
			padPrint += inputStr.charAt(i);
		}
		for (int i = padPrint.length(); i < n; i++) {
			padPrint += ",";
		}
		return padPrint;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trimAndConcat("Cat ", "Dog"));
		System.out.println(getIndexOrNull("cat", 'a'));
		System.out.println(padPrint("cat", 5));

	}

}
