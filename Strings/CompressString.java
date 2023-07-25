package Strings;

public class CompressString {

	public static void main(String[] args) {

		String str = "aaabbccdeea";

		System.out.print(compress(str));

	}

	public static String compress(String str) {

		String res = "";

		int i = 0;

		for (int j = 0; j < str.length() - 1; j++) {

			if (str.charAt(j) != str.charAt(j + 1)) {

				if (j - i > 1) {
					res = res + str.charAt(j) + (j - i+1);
				} else {
					res = res + str.charAt(j);
				}

				i = j;

			}

		}

		return res;
	}

}
