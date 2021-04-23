public class Main {
	public static void main(String[] args) {
TreeNode t1=new TreeNode(1);
TreeNode t2=new TreeNode(2);
TreeNode t3=new TreeNode(3);
TreeNode t4=new TreeNode(4);
TreeNode t5=new TreeNode(5);
TreeNode t6=new TreeNode(6);
TreeNode t7=new TreeNode(7);
t1.left=t2;
t1.right=t3;
t2.left=t4;
t2.right=t5;
t3.left=t6;
t3.right=t7;
t1.preorder(t1);
	}
}
class TreeNode {
	int data;
	TreeNode left, right;
	public TreeNode(int data) {
		this.data = data;
	}

	public void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
}