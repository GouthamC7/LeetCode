package org.goutham.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String item : strs) {
			char[] temp = item.toCharArray();
			Arrays.sort(temp);
			String sortedString = new String(temp);
			if(map.containsKey(sortedString)) {
				map.get(sortedString).add(item);
			} else {
				List<String> tempList = new ArrayList<String>();
				tempList.add(item);
				map.put(sortedString, tempList);
			}
		}
		return new ArrayList<>(map.values());
		
	}
	
	/**
	 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
	 * Output:
	 *	[
  	 *	    ["ate","eat","tea"],
  	 *		["nat","tan"],
  	 *		["bat"]
	 *	]
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));

	}

}
