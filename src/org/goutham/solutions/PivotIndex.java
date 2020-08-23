package org.goutham.solutions;


public class PivotIndex {
	
    public static int pivotIndex(int[] nums) {
        int right[] = new int[nums.length];
        right[0] = 0;
        int left = 0;
        for(int i=nums.length-2;i>=0;i--) {
        	right[i] = right[i+1]+nums[i+1];
        }
        if(nums[0] == right[0]) return 0;
        for(int i=1;i<nums.length;i++) {
        	left = left+nums[i-1];
        	if(left == right[i]) return i;
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pivotIndex(new int[] {1,2,3,4,5});
	}

}
