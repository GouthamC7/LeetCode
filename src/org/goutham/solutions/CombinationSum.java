package org.goutham.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	
    	List<Integer> current = new ArrayList<Integer>();
    	Arrays.sort(candidates);// 
    	dfs(candidates, target, 0, current, 0);
    	return result;
    }
    
    public void dfs(int[] candidates, int target, int sum,List<Integer> current, int start) {
		if(sum == target) {
			result.add(current);
			return;
		}
		else if(sum>target) return;
		else {
			for(int i=0;i<candidates.length;i++) {
				sum +=candidates[i];
				current.add(candidates[i]);
				dfs(candidates, target, sum, current, i);
				current.remove(current.size()-1);
				sum-=candidates[i];
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
