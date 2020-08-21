package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LongestHarmoniusSub {
	
	public static int findLHS(int[] nums) {
		int highest = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num:nums) {
        	map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int i:map.keySet()) {
        	if(map.containsKey(i-1)) highest = Math.max(highest, map.get(i)+map.get(i-1));
        	if(map.containsKey(i+1)) highest = Math.max(highest, map.get(i)+map.get(i+1));
        }
        return highest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLHS(new int[] {1,3,2,2,5,2,3,7});
	}

}
