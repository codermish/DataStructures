package Stack;

import java.util.*;

public class ReverseAStack {

	static Stack<Integer> st = new Stack<>();

	public static void main(String[] args) {
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);
		System.out.println("Given stack is ");
		for (Integer val : st) {
			System.out.print(val + " ");
		}
		System.out.println();
		reverseStack(st);
		System.out.println("after stack is ");
		for (Integer val : st) {
			System.out.print(val + " ");
		}

	}

	// main method to reverse the stack
	public static void reverseStack(Stack<Integer> st) {
		if (st.isEmpty()) {
			return;
		}
		int temp = st.peek();
		st.pop();
		reverseStack(st);
		insertAtLastPosn(temp, st, 0, st.size());

	}

	// method to insert the element at the bottom
	public static void insertAtLastPosn(int val, Stack<Integer> st, int count, int size) {

//		if(st.isEmpty()) {
//			st.push(val);
//			return;
//		}

		if (count == size) {
			st.push(val);
			return;
		}

		int temp = st.peek();
		st.pop();
		insertAtLastPosn(val, st, count + 1, size);
		st.push(temp);
	}
}
