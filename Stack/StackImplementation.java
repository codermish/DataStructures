package Stack;

public class StackImplementation {

	// properties of stack class

	static int top;
	static int size;
	static int arr[];

	StackImplementation(int size) {

		this.size = size;
		top = -1;
		arr = new int[size];
		System.out.println("size is " + size);
	}

	// push operation
	public static void push(int data) {

		if (top >= size) {
			System.out.println("stack overflow");
		} else {
			top++;
			arr[top] = data;
		}
	}

	// pop operation
	public static void pop() {
		if (top == -1) {
			System.out.print("stack underflow");
		}

		else {
			top--;
		}

	}

	// top operation

	public static int top() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}

		else {
			return arr[top];
		}
	}

	// empty stack check

	public static boolean empty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	//size check 
	public static int size() {
		
		return top;
		
	}

	public static void main(String args[]) {

		StackImplementation st = new StackImplementation(5);
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println("top of stack is " + st.top());
		
		st.pop();
		System.out.println("top of stack is " + st.top());

		st.pop();
		System.out.println("top of stack is " + st.top());
		
		st.pop();
		System.out.println("top of stack is " + st.top());
		
		if(st.empty()) {
			
			System.out.println("stack is empty now");
		}
		else {
			System.out.println("stack is not empty");
		}
		
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(10);
		st.push(20);
		
		

		

	}

}
