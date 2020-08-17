package org.goutham.solutions;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class IsoMorphic {
	
	public boolean isIsomorphic(String s1, String s2) {
		Queue<Integer> queue = new LinkedList<>(); 
		
		
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
