package org.goutham.solutions;

public class UnsortedSub {
	
    public static int findUnsortedSubarray(int[] nums) {
        int start = -1,end = 0;
        for (int i = 1; i < nums.length; i++) {
			if(nums[i] >= nums[i-1]) continue;
			else {
				if(start == -1) start = i-1;
				while(i<nums.length && nums[i]<=nums[i-1]) i++;
				if(i==nums.length-1) end = nums.length;
				else end = i-1;
			}
		}
        return start == -1?0:end-start+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findUnsortedSubarray(new int[] {2,6,4,8,10,9,15});
	}

}
