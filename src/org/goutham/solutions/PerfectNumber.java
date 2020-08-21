package org.goutham.solutions;

public class PerfectNumber {
	
public static boolean checkPerfectNumber(int num) {
        int res = 1;
        for(int i=2;i<=Math.sqrt(num);i++) {
        	if(num%i==0) {
        		if(num/i == i) res = res+i;
        		else res = res+i+num/i;
        	}
        }
        return res == num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(checkPerfectNumber(2));
	}
	
public boolean detectCapitalUse(String word) {
	if(word.length()<2) return true;
        int c = 0, nc=0;
        for(char ch:word.toCharArray()) {
        	if(Character.isUpperCase(ch)) c++;
        	else nc++;
        }
        if(c==word.length() || nc == word.length()) return true;
        else if (c==1) return Character.isUpperCase(word.charAt(0));
        else return false;
    }

}
