package org.goutham.solutions;

public class HouseRobber {
	public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] result = new int[nums.length+1];
        result[0] = 0;
        result[1] = nums[0];
        int i=2;
        while(i<nums.length) {
        	result[i] = Math.max(result[i-1], result[i-2]+nums[i]);
        }
        return result[nums.length];
    }
}
