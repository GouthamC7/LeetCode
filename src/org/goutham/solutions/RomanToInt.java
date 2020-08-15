package org.goutham.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInt {
	
	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = 0;
        char[] roman = s.toCharArray();
        for(int i=0; i<roman.length;i++) {
        	if(i+1<roman.length && map.get(roman[i+1]) > map.get(roman[i])) {
        		result = result + map.get(roman[i+1]) - map.get(roman[i]);
        		i++;
        	} else {
        	result = result + map.get(roman[i]);
        	}
        }
        return result;
    }
	
	public static void main(String args[]) {
		System.out.print(romanToInt("III"));
		System.out.print(isValid("(()[]{}"));
		binarytoInt("1111");
	}
	
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char pop;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++) {
            if(c[i]=='(' || c[i]=='{'||c[i]=='[') {
                stack.push(c[i]);
            } else {
            	if(c[i] == ')') {
            		pop = stack.pop();
            		if(pop != '(') {
            			return false;
            		}
            	}
            	if(c[i] == ']') {
            		pop = stack.pop();
            		if(pop != '[') {
            			return false;
            		}
            	}
            	if(c[i] == '}') {
            		pop = stack.pop();
            		if(pop != '{') {
            			return false;
            		}
            	}
            }
        }
        if(stack.isEmpty()) {
        	return true;
        }
        return false;
        
    }
	
	public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        if(str.length == 0) {
            return 0;
        } else {
            return str[str.length-1].length();
        }
        
    }
	
	public String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		String string = "1";
		int count = 0;
		char num ;
		for(int i=1;i<n;i++) {
			count = 0;
			char[] c = string.toCharArray();
			num = c[0];
			for(int j=0;j<c.length;j++) {
				count++;
				if(num != c[j]) {
					
				}
			}
		}
		
		return null;
        
    }
	
	public String addBinary(String a, String b) {
		
		
		
		return null;
	}
	
	public static int binarytoInt(String s) {
		char[] c = s.toCharArray();
		int value = 0;
		for(int i=s.length()-1;i>=0;i--) {
			value = (int) (value+Math.pow(2,i));
		}
		return value;
	}

}
