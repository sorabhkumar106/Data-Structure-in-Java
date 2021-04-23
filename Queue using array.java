public class Main {
	public static void main(String[] args) {
Queue q=new Queue(5);
q.enque(1);
q.enque(78);
q.enque(6);
q.enque(56);
q.display();
q.deque();
System.out.println("\n");
q.display();
q.deque();
System.out.println("\n");
q.display();
System.out.println();
System.out.println(q.peekFirst());
System.out.println();
System.out.println(q.peekLast());
	}
}
class Queue {
	int rear, front = -1;
	int arr[];
	int size;
	public Queue(int size) {
		this.size=size;
		this.arr = new  int[size];
	}
	public void enque(int data) {
		if (rear == size - 1) {
			System.out.println("Queue is overflow, You cant't add element");
		return;
		} else {
			rear +=1;
			arr[rear] = data;
		}
		if (front == -1) {
			front  += 1;
		}
	}
public void deque(){
if(front==-1){
System.out.println("under flow state");
return;
}		
arr[front]=0;
front=front+1;	
}
public int peekFirst(){
return arr[front];	
}
public int peekLast(){
return arr[rear];	
}
public void display(){
	for(int i=front+1;i<=rear;i++){
	System.out.print(arr[i]+" ");	
	}
}
}