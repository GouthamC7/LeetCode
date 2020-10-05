package org.goutham.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombo {
	
	static Map<Character, String> NUMS = new HashMap<>() {
        {
            put('0', "");
            put('1', "");
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<String>();
        }
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        dfs(sb, 0, digits, NUMS, res);

        return res;
    }

	private static void dfs(StringBuilder sb, int i, String digits, Map<Character, String> nUMS2, List<String> res) {
		// TODO Auto-generated method stub
		if (i == digits.length()) {
			res.add(sb.toString());
			return;
		}
		String string = nUMS2.get(digits.charAt(i));
		for(char ch : string.toCharArray()) {
			sb.append(ch);
			dfs(sb, i+1, digits, nUMS2, res);
			sb.deleteCharAt(sb.length()-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList = (ArrayList<String>) letterCombinations("23");
		for(String s: aList) System.out.println(s);
	}

}
