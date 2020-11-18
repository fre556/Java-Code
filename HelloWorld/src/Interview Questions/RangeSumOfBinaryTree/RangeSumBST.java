package RangeSumOfBinaryTree;

import java.util.Queue;

import javax.swing.tree.TreeNode;

import LinkedList.LinkedList;

public class RangeSumBST {
	
	public int RangeSum(TreeNode root, int L, int R) {
		int sum = 0 ;
		
		if(root==null) {
			return sum;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode current = queue.remove();
			
			if(current.val >= L && current.val <= R) {
				sum = sum + current.val;
				
			
			}
			
			if(current.left !=null && current.val >L) {
				queue.add(current.left);
			}
			
			if(current.right != null && current.val < R) {
				queue.add(current.right);
			}
		}
		return sum;
	}

}
