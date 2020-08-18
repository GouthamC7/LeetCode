package org.goutham.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class RansomNote {
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
	        Map<Character, Integer> map = new HashMap<>();
	        for(char m: magazine.toCharArray()) {
	            if(map.containsKey(m)) {
	            	map.put(m, map.getOrDefault(m, 0)+1);
	            } else {
	            	map.put(m, 1);
	            }
	        }
	        for(char r: ransomNote.toCharArray()) {
	        	if(map.containsKey(r)) {
	        		if(map.get(r) == 0) return false;
	        		map.put(r, map.getOrDefault(r, 0)-1);
	        	} else {
	        		return false;
	        	}
	        }
	        return true;
	    }
	 
	 public static boolean canConstruct1(String ransomNote, String magazine) {
		 if(magazine.length() < ransomNote.length()) return false;
	        char[] r = ransomNote.toCharArray();
			 char[] m = magazine.toCharArray();
			 Arrays.sort(r);
			 Arrays.sort(m);
			 for(int i=0;i<r.length;i++) {
				 if(r[i] != m[i]) return false;
			 }
			 return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canConstruct1("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
	}

}
