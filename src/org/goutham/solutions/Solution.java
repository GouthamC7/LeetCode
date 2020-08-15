package org.goutham.solutions;

class Solution {
	
	
	
	
	static boolean res = true;
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)
            return true;
        
        findHeight(root);  
        return res;
    }
 
    public static int findHeight(TreeNode root){
        
        if(root == null)
            return 0;
        
        int left = findHeight(root.left);
        int right = findHeight(root.right);
        
        if(Math.abs(left - right) > 1)
            res = false;
        return Math.max(left, right) + 1;
    }
    
    public static void main(String args[]) {
    	TreeNode t1 = new TreeNode(3);
    	TreeNode t2 = new TreeNode(9);
    	TreeNode t3 = new TreeNode(20);
    	TreeNode t4 = new TreeNode(15);
    	TreeNode t5 = new TreeNode(7);
    	t1.left = t2;
    	t1.right = t3;
    	t3.left = t4;
    	t3.right = t5;
    	findHeight(t1);
    	int a[] = {1,2,3,0,0,0};
    	int b[] = {2,5,6};
    	merge(a, 3, b, 3);
		
	}
    
    
    public static void merge(int[] a, int m, int[] b, int n) {
    	int temp = m+n-1;
    	m = m-1;
    	n = n-1;
    	while(m != -1 && n != -1) {
    		if(b[n] >= a[m]) {
    			a[temp] = b[n];
    			n--;
    			temp--;
    		} else {
    			a[temp] = a[m];
    			temp--;
    			m--;
    		}
    	}
    	if(m==-1) {
    		while(temp == -1) {
    			a[temp] = b[n];
    			n--;
    		}
    	}
    	
    	for(int i=0;i<6;i++) {
    		System.out.println(a[i]);
    	}
    }
}
