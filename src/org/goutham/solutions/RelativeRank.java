package org.goutham.solutions;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RelativeRank {
	
public static String[] findRelativeRanks(int[] nums) {
	TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	int[] temp = nums;
	Arrays.sort(temp);
	for(int i=0;i<temp.length;i++) {
		map.put(temp[i], i);
	}
	String[] resultStrings = new String[nums.length];
	for(int i=0;i<nums.length;i++) {
		Integer tInteger = map.get((Integer)i);
		if(tInteger==0) resultStrings[i] = "Gold Medal";
		else if(tInteger==1) resultStrings[i] = "Silver Medal";
		else if(tInteger==2) resultStrings[i] = "Bronze Medal";
		else {
			resultStrings[i] = String.valueOf(tInteger);
		}
	}
	return resultStrings;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] reStrings = findRelativeRanks(new int[] {10,3,8,9,4 });
		
		for (int i = 0; i < reStrings.length; i++) {
			System.out.println(reStrings[i]);
		}
	}

}
