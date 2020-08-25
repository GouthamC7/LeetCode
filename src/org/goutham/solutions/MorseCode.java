package org.goutham.solutions;

import java.util.HashSet;
import java.util.Set;

public class MorseCode {
	public static int uniqueMorseRepresentations(String[] words) {
		String tempString = "";
		Set<String> set = new HashSet<String>();
		String[] codes = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
        for(String s:words) {
        	tempString = "";
        	for(char c:s.toCharArray()) {
        		tempString = tempString + codes[c-'a'];
        	}
        	set.add(tempString);
        }
        return set.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"});
	}

}
