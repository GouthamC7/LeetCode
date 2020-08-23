package org.goutham.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelBT {
	
public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
        	int len = queue.size();
        	Double avg = 0.0;
        	for(int i=0;i<len;i++) {
        		TreeNode node = queue.poll(); 
        		avg = avg+node.val;
        		if(node.left != null) queue.add(node.left);
        		if(node.right != null) queue.add(node.right);
        	}
        	list.add((double) (avg/len));
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
