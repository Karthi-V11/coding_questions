//Approach: Level Order Traversal + Index Tracking
//Use a queue to do BFS
//
//For each node, track its index (as if it's in a complete binary tree)
//
//Left child → 2 * index + 1
//
//Right child → 2 * index + 2
//
//For each level:
//
//Compute width: lastIndex - firstIndex + 1
//
//Keep max
//
//
//tc=O(n), sc=O(n)


package Expected_programs;


import java.util.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
}

class NodeWithIndex{
	TreeNode node;
	int index;
	
	NodeWithIndex(TreeNode node,int index){
		this.node=node;
		this.index=index;
	}
}

public class MaxWidth_BinaryTree{
	
	static int widthOfBinaryTree(TreeNode root) {
		Queue<NodeWithIndex>q=new LinkedList<NodeWithIndex>();
		q.add(new NodeWithIndex(root,0));
		int ans=0;
		
		while(!q.isEmpty()) {
			int size=q.size();
			int min_index=q.peek().index;
			int first =0,last=0;
			
			for(int i=0;i<size;i++) {
				
				NodeWithIndex current = q.poll();
				int cur_index = current.index-min_index;
				TreeNode node =current.node;
				
				if(i==0) first =cur_index;
				if(i==size-1) last =cur_index;
				
				if(node.left!=null) {
					q.add(new NodeWithIndex(node.left, 2*cur_index+1));
				}
				if(node.right!=null) {
					q.add(new NodeWithIndex(node.right, 2*cur_index+2));
				}
				
			}
			ans=Math.max(ans, last-first+1);
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		
	      int maxWidth = widthOfBinaryTree(root);
	      System.out.println("Maximum width of the binary tree is: " + maxWidth);
	}
}

