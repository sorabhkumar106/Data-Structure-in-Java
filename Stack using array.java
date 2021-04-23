public class Main {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(23);
		st.push(12);
		st.push(87);
		st.push(98);
		st.push(76);
		st.push(55);
		st.show();
		System.out.println(" " + st.peek());
		System.out.println();
		st.pop();
		st.show();
		System.out.println(" " + st.peek());
		System.out.println();
		st.pop();
		st.show();
		System.out.println(" "+st.peek());
	}
}
class Stack {
	int top = -1;
	int[] arr;
	int len;
	public Stack(int size) {
		len = size;
		arr = new int[size];
	}
	public boolean push(int data) {
		if (top == len - 1) {
			System.out.println("Stack is overflow");
			return false;
		} else {
			top = top + 1;
			arr[top] = data;
			return true;
		}
	}
	public boolean pop() {
		if (top == -1) {
			System.out.println("Stack is empty !");
			return false;
		}
		arr[top] = 0;
		top--;
		return true;
	}
	public boolean isEmpty() {
		return top < 0;
	}
	public int peek() {

		return arr[top];
	}
	public void show() {
		for (int i = top; i >= 0; i--) {
			System.out.println("|" + arr[i] + "|");
		}
	}

}