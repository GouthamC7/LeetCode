package org.goutham.solutions;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i=0; i<nums.length; i++) {
            res = res^nums[i];
        }
        return res;
    }
	
	/**
	 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
	 * Input: [4,1,2,1,2].
	 * Output: 4
	 * Solution: Bit manipulation.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}

}
