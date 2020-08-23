package org.goutham.solutions;

public class MaxAvgSubArray {
	
	//1,12,-5,-6,50,3
	
public static double findMaxAverage(int[] nums, int k) {
	int a =nums.length;
        double avg = 0.0;
        double total = 0.0;
        int i=0;
        while(i<k)total+=nums[i++];
        avg = total/k;
        for(i=i;i<nums.length;i++) {
        	if(nums[i-k] > 0) total = total - nums[i-k];
        	else total = total + nums[i-k];
        	total = total + nums[i];
        	if(total/k > avg) avg = total/k;
        }
        return avg;
    }

	public static void main(String[] args) {
		int a = 1;
		int b = 1^2^2^4;
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
	}

}
