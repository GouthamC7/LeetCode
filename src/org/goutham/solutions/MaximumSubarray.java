package org.goutham.solutions;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for(int i=0; i<nums.length; i++) {
            max_ending_here = max_ending_here + nums[i]; 
            if (max_so_far < max_ending_here) 
                max_so_far = max_ending_here; 
            if (max_ending_here < 0) 
                max_ending_here = 0;
        }
        return max_so_far;
    }
	
	/**
	 * Input: [-2,1,-3,4,-1,2,1,-5,4],
	 * Output: 6
	 * Explanation: [4,-1,2,1] has the largest sum = 6.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

	}

}
