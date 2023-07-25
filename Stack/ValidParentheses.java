package Stack;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		String str = "[{()}]";
		boolean ans = checkValidParen(str);
		System.out.print(ans);
	}

	public static boolean checkValidParen(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '[' || c == '{' || c == '(') {
				st.push(c);

			}

			else {
				if (!st.empty()) {

					char ch = st.peek();

					if ((ch == '[' && c == ']') || (ch == '{' && c == '}') || (ch == '(' && c == ')')) {
						st.pop();

					} else {
						return false;
					}
				}

				else {
					return false;
				}
			}

		}
		if (st.empty()) {
			return true;
		} else {
			return false;
		}

	}
}
