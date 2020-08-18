package org.goutham.solutions;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
	
	
	public static String reverseVowels(String s) {
        if(s.length()<2) return s;
        Set<Character> map = new HashSet<>();
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i<j) {
            while(!map.contains(chars[i]) && i<j) {
                i++;
            }
            while(map.contains(chars[j]) && j>i) {
                j--;
            }
            if(i<j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;j--;
            } else break;
            
        }
        return new String(chars);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverseVowels("hello");
		isPerfectSquare(808201);
	}
	
	public static boolean isPerfectSquare(int num) {
		Double double1 = Math.sqrt(num);
        if(num<1) return false;
        if(num == 1) return true;
        long l = 1, r = num/2;
        while(l<=r) {
            long mid = l + (r-l)/2;
            if(mid*mid == num) return true;
            else if (mid*mid > num) r = mid-1;
            else l = mid+1;
        }
        return false;
    }

}
