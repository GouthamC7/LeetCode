package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;

public class NextGreater {
	
public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	int greater = -1;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	map.put(nums2[nums2.length-1],-1);
        for(int i = nums2.length-2;i>=0;i--) {
        	if(nums2[i] < nums2[i+1]) {
        		map.put(nums2[i],nums2[i+1]);
        		greater = nums2[i+1];
        	} else {
        		map.put(nums2[i],greater);
        	}
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
        	result[i] = map.get(nums1[i]);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
	}

}
