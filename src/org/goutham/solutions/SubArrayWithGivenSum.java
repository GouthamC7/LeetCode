package org.goutham.solutions;

public class SubArrayWithGivenSum {
	
	public static void Find(int nums[], int target) {
		int i=0,j=0, total=0;
		while(i<nums.length-1) {
			total=total + nums[i];
			if(total == target) {
				System.out.println(i+"-------------"+j);
				return;
			} else if(total<target) {
				i++;
				continue;
			}
			else {
				while(total>target) {
					total = total - nums[j++];
				}
			}
			if(total == target) {
				System.out.println(i+"-------------"+j);
				return;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find(new int[] {1,2,3,4,5,6,7,8,9,10}, 15);
	}

}
