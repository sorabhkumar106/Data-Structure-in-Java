public class Main {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque("Faster saas");
		q.enque("Faster digital services");
		q.enque("Faster AI&MI");
		q.enque("Faster finacial services");
		q.enque("Faster Anlytics");
		q.display();
		q.deque();
		q.deque();
		System.out.println();
		q.display();
		System.out.println();
		System.out.println(q.peekFirst());
		System.out.println();
		System.out.println(q.peekLast());
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
class Queue {
	Node head;
	Node tail;
	public Queue() {
		this.head = null;
		this.tail = null;
	}
	public void enque(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
			return;
		} else {
			tail.next = newNode;
			tail = tail.next;
		}
	}
	public void deque() {
		if (head == null) {
			return;
		}
		head = head.next;
	}
	public String peekFirst() {
		if (head == null) {
			return "";
		}
		return head.data;
	}
	public String peekLast() {
		if (tail == null) {
			return "";
		}
		return tail.data;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}