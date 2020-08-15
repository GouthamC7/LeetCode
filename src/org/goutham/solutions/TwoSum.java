package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;



public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
	
	public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n%2) & 1;
            n >>>= 1;
        }
        reverseBits(00000000000000000000000000001011);
        return count;
    }
	
	public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
	
	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = twoSum(new int[] {1,2,3,6},7);
		System.out.print(hammingWeight(00000000000000000000000000001011));


	}
	
	public static int reverse(int x) {
        int result = 0;	
        while (x != 0) {
            result = result * 10;
            int per = x % 10;
            result = result + per;
            x = x/10;
        }
        return result;
    }
	
public int majorityElement(int[] nums) {
	Map<Integer, Integer> map= new HashMap<Integer,Integer>();
	for(int i=0;i<nums.length;i++) {
		if(map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i])+1);
		} else {
			map.put(nums[i], 1);
		}
	}
	int minnum = 0;
	int count = 0;
	for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
        if(entry.getValue() > count) {
        	minnum = entry.getKey();
        	count = entry.getValue();
        }
        
    }
	return minnum;
}
}