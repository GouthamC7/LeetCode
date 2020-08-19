package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;


public final class LongestPalindrome {
	
	public static int longestPalindrome(String s) {
        int result = 0;
        int prevInd = -1;
        int nums[] = new int[256];
        for(int i=0; i<s.length();i++) {
        	nums[s.charAt(i)]++;
        }
        for(int i=0; i<s.length();i++) {
        	if(nums[s.charAt(i)] == -1) continue;
        	else if (nums[s.charAt(i)] % 2 == 0) {
        		result = result+nums[s.charAt(i)];
        		nums[s.charAt(i)] = -1;
        	}
        	else {
        		if(prevInd == -1) {
        			result = result+nums[s.charAt(i)];
        			prevInd = s.charAt(i);
        		} else {
        			int one = nums[s.charAt(i)];
        			int two = nums[prevInd];
        			if(nums[s.charAt(i)] > nums[prevInd]) {
        				result = result + (nums[s.charAt(i)] - 1);
        				prevInd = s.charAt(i);
        			}
        		}
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(thirdMax(new int[] {2,2,3,1}));
	}
	
	public static int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0]>nums[1] ? nums[0]: nums[1];
        int a = nums[0], b = Integer.MIN_VALUE, c = 0, temp = 0;
        for(int i=1;i<nums.length;i++) {
            temp = nums[i];
            if(temp > a) {
                temp = a;
                a = nums[i];
            }
            if(temp>b && temp != a) {
                int j = temp;
                temp = b;
                b = j;
            }
            if(temp>c && (temp!=a || temp != b)) {
                c = temp;
            }
        }
        return c;
    }

}
