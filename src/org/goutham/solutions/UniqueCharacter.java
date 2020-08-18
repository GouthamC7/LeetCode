package org.goutham.solutions;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {
	
public static int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        //Set<Character> set = new LinkedHashSet<Character>();
        for(char ch: c) {
        	//set.add(ch);
            if(map.containsKey(ch)) {
            	map.put(ch, map.getOrDefault(ch, 0)+1);
            } else {
            	map.put(ch, 1);
            }
        }
        for(int i = 0;i<c.length;i++) {
        	if(map.get(c[i]) == 1) return i;
        }
        return -1;
    }
public int  firstUnique(String s) {
	int len = s.length();
    
    if(len == 0){
        return -1;
    }
    
    int[] arr = new int[26];
    
    for(char c : s.toCharArray()){
        arr[c - 'a']++;
    }
    
    for(int i=0; i<len; i++){
        if(arr[s.charAt(i) - 'a'] == 1){
            return i;
        }
    }
    
    return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
