package org.goutham.solutions;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }
    
    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        
        return root;
    }
    
    public static void main(String args[]) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t3 = new TreeNode(3);
		TreeNode t2 = new TreeNode(2,t1,t3);
		TreeNode t6 = new TreeNode(6);
		TreeNode t9 = new TreeNode(9);
		TreeNode t7 = new TreeNode(7,t6,t9);
		TreeNode t4 = new TreeNode(7,t2,t7);
		invertTree(t4);
	}
}


	
