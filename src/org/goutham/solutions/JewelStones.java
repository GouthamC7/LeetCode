package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;

public class JewelStones {
	
	public static int numJewelsInStones(String J, String S) {
        Map<Character,Integer>map = new HashMap<>();
        for(char ch: S.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int result = 0;
        for(char ch: S.toCharArray()) {
            result += map.getOrDefault(ch,0);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numJewelsInStones("aA", "aAAbbbb");
	}

}
