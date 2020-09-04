package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new ArrayList<>(), nums);
        return results;
    }

	private static void dfs(List<List<Integer>> results, ArrayList path, int[] nums) {
		// TODO Auto-generated method stub
		if(path.size() == nums.length) {
			results.add(new ArrayList<>(path));
			return;
		}
		else {
			for(int i=0;i<nums.length;i++) {
				if(path.contains(nums[i])) continue;
				path.add(nums[i]);
				dfs(results, path, nums);
				path.remove(path.size()-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute(new int[] {1,2,3});
	}

}
