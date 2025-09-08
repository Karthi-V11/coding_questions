import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepth_BinaryTree {

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.left = new Node(8);
		root.right.left.right = new Node(9);
		root.right.left.right.left = new Node(10);

		System.out.println("The Maximum height or \nDepth of the given Tree is: " + MaximumHeight(root));

	}

//	static int  MaximumHeight(Node root) {
//		if(root==null)return 0;
//		Queue<Node> q = new LinkedList<Node>();
//		int level=0;
//		q.add(root);
//		
//		while(!q.isEmpty()) {
//			int size =q.size();
//			
//			for(int i=0;i<size;i++) {
//				Node front =q.poll();
//				if(front.left!=null)q.add(front.left);
//				if(front.right!=null)q.add(front.right);
//				
//			}
//			level++;
//		}
//		
//		return level;
//	}

	static int MaximumHeight(Node root) {

		return root == null ? 0 : Math.max(MaximumHeight(root.left), MaximumHeight(root.right)) + 1;
	}

}

class Node {
	int data;
	Node left;
	Node right;

	Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
