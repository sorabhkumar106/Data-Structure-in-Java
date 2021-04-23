public class Main {
	public static void main(String[] args) {
	Stack st=new Stack();
	st.push(1);
	st.push(3);	
	st.push(9);
	st.push(7);
	st.push(5);
	st.display();
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.peek());
	}
}
class Node{
int data;
Node next;	
public Node(int data){
this.data=data;
this.next=null;	
		}	
}
class Stack{
	Node head;
public Stack(){
		this.head=null;
		}
public boolean push(int data){
if(head == null){
		head=new Node(data);
		return true;
			}
else{
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return true;
			}	
		}
public int pop(){
if(head == null){
return -1;	
	}
	int data=head.data;
	head=head.next;
	return data;			
}
public void display(){
Node temp=head;
while (temp!=null){
System.out.println("| "+temp.data+" |");
temp=temp.next;	
		}	
}
public int peek(){
	return head.data;
		
			}
public boolean isEmpty(){
	return head==null;
		
			}	
}