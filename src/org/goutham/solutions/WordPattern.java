package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(strings.length != pattern.length()) return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i=0;i<strings.length;i++) {
            if(!map.containsKey(pattern.charAt(i))) map.put(pattern.charAt(i), strings[i]);
            else {
                if(!map.get(pattern.charAt(i)).equals(strings[i])) return false;
            }
        }
        return true;
    }
	public static void main(String args[]) {
		wordPattern("abba", "dog cat cat dog");
	}
}
