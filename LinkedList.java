public class Main {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.insert("Faster AI&ML");
		li.insert("Faster saas platforms");
		li.insert("Tata");
		li.insertAtPos(2, "Faster AI");
		li.insertAtPos(4, "wipro");
		li.deleteAt(4);
		System.out.println(li.length());
		li.show();
	}
}
class Node {
	String data;
	Node next;
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
}
class LinkedList {
	Node head;
	public LinkedList() {
		this.head = null;
	}
	public boolean insert(String data) {
		if (head == null) {
			head = new Node(data);
			return true;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			return true;
		}
	}
	public boolean insertAtPos(int pos, String data) {
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
			return true;
		} else {
			Node temp = head;
			for (int i = 1; temp != null && i < pos - 1; i++) {

				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			return true;
		}
	}
	public boolean deleteAt(int pos) {
		if (head == null) {
			return false;
		}
		if (pos == 1) {
			head = head.next;
			return true;
		} else {
			Node temp = head;
			for (int i = 1; temp != null && i < pos - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			return true;
		}
	}
	public int length() {
		if (head == null) {
			return 0;
		}
		int len = 0;
		Node temp = head;
		while (temp != null) {
			len += 1;
			temp = temp.next;
		}
		return len;
	}
	public void show() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.data);
//	System.out.println();
			temp = temp.next;
		}
	}
}