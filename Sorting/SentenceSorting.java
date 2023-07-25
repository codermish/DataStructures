package Sorting;

import java.util.*;

public class SentenceSorting {

	public static void main(String args[]) {

		String str = "is2 sentence4 This1 a3";
		List<String> list = new ArrayList<>();

		String[] strSplit = str.split(" ");

		for (int i = 0; i < strSplit.length; i++) {

			list.add(strSplit[i]);

		}

		int i = 0;
		String res = "";

		String val[] = new String[list.size()];
		for (String data : list) {

			i = Integer.parseInt(String.valueOf(data.charAt(data.length() - 1)));

			val[i - 1] = data.substring(0, data.length() - 1);

		}

		for (int j = 0; j < val.length; j++) {
			res = res + val[j] + " ";
		}
		System.out.println(res);

	}

}
