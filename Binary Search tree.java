public class Main {
	public static void main(String[] args) {
BT bt=new BT();
bt.root=bt.insert(40,bt.root);
bt.root=bt.insert(70,bt.root);
bt.root=bt.insert(30,bt.root);
bt.root=bt.insert(15,bt.root);
bt.root=bt.insert(55,bt.root);
bt.root=bt.insert(75,bt.root);
bt.root=bt.insert(75,bt.root);
bt.preorder(bt.root);
bt.root=bt.deletion(75,bt.root);
System.out.println();
bt.preorder(bt.root);
	}
}
class Node {
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
	}
}
class BT {
	Node root;
	public BT() {
		this.root = null;
	}
	public Node insert(int data, Node root) {
		if (root == null) {
			root = new Node(data);
		} else if (data < root.data) {
			root.left = insert(data, root.left);
		} else if (data > root.data) {
			root.right = insert(data, root.right);
		} else {
			System.out.println("Please don't enter duplicate value!");
		}
		return root;
	}
	public Node deletion(int data, Node root) {
		if (data < root.data) {
			root.left = deletion(data, root.left);
		} else if (data > root.data) {
			root.right = deletion(data, root.right);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.right == null) {
				return root.left;
			} else if (root.left == null) {
				return root.right;
			}
			int min_value=find_min(root.right);
			root.data=min_value;
			root.right=deletion(min_value,root.right);
		}
		return root;
	}
public int find_min(Node root){
	if(root.left==null){	
	return root.data;		
	}
	return find_min(root.left);	
}
public void preorder(Node root){
if(root==null){
return;	
	}
System.out.println(root.data);
preorder(root.left);
preorder(root.right);	
}
}
