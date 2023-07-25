package Stack;

import java.util.*;
import java.io.*;

public class CostToMakeAStringValid {

	public static void main(String[] args) {

	}

	public static int findMinimumCost(String str) {
		if (str.length() % 2 == 1) {
			return -1;
		}
		int ans = -1;
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{') {
				st.push(ch);
			} else {
				if (!st.isEmpty() && st.peek() == '{') {
					st.pop();
				} else {
					st.push(ch);
				}
			}
		}
		// now the stack contains invalid part

		int a = 0;
		int b = 0;
		if (st.isEmpty()) {
			return 0;
		} else {
			while (!st.isEmpty()) {
				int peek = st.peek();
				if (peek == '{') {
					a++;
				} else {
					b++;
				}
				st.pop();

			}
			ans = (a + 1) / 2 + (b + 1) / 2;
		}

		return ans;

	}

}
