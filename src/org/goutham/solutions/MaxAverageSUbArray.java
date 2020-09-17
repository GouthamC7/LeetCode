package org.goutham.solutions;

public class MaxAverageSUbArray {

	public static double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        double total = 0.0;
        int i=0;
        while(i<k)total+=nums[i++];
        avg = total/k;
        for(i=i;i<nums.length-k;i++) {
        	total = total-nums[i-k]+nums[i];
            avg = avg > total/k ? avg: total/k;
        }
        return avg;
    }
	
	public static void main(String[] args) {
		findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);
	}
}
