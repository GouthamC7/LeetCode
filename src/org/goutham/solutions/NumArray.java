package org.goutham.solutions;

public class NumArray {
	private int numbers[];

    public NumArray(int[] nums) {
    	if(nums.length == 0) return;
    	numbers = new int[nums.length];
        numbers[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
            numbers[i] = nums[i]+numbers[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
    	
        if(i>j) return 0;
        if(i==0) return numbers[j];
        else return numbers[j]-numbers[i-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
		int param_1 = obj.sumRange(0,3);
		int param_2 = obj.sumRange(2,5);

	}

}
