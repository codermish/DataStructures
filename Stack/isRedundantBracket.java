package Stack;

import java.util.Stack;

public class isRedundantBracket {

	public static void main(String[] args) {

		System.out.print(isRedundant("((a+b))"));

	}

	public static boolean isRedundant(String str) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == '(' || ch == '+' || ch == '-' || ch == 'x' || ch == '/') {

				st.push(ch);

			}

			else {

				// its a closing bracket or alphabet

				if (st.empty()) {

					return true;
				}

				else if (ch == ')') {
					boolean isRedundant = true;

					while (st.peek() != '(') {

						char c = st.peek();

						if (c == '+' || c == '-' || c == 'x' || c == '/') {
							isRedundant = false;
							st.pop();

						}

					}

					if (isRedundant == true) {
						return true;
					}
					st.pop();

				}

			}

		}

		return false;

	}

}
