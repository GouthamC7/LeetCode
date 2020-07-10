package org.goutham.solutions;

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
		int zero = 0, l = 0, r = nums.length;
		while (l < r) {
			if (nums[l] != 0) {
				int tmp = nums[zero];
				nums[zero++] = nums[l];
				nums[l] = tmp;
			}
			l++;
		}
	}
	
	/**
	 * Given an array nums, 
	 * write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * Input: [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
