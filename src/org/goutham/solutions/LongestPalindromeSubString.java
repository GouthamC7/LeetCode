package org.goutham.solutions;

public final class LongestPalindromeSubString {
	
	private String maxString = "";
	private int maxLength = 0;

	public String longestPalindrome(String s) {
		char[] chars = s.toCharArray();
		int length = chars.length;
	    for (int i=0; i<length; i++) {
	    	// find longest odd palindrome
	    	findPalindrome(chars, length, i, 0);
	    	// find longest even palindrome
	    	findPalindrome(chars, length, i, 1);
	    }
	    return maxString;
	}

	private void findPalindrome(char[] chars, int length, int i, int shift) {
		int left = i;
		int right= i+shift;
		while (left >= 0 && right < length && chars[left] == chars[right]){
			left--; right++;
		}
		if ((right-left-1) > maxLength) {
			maxLength = right-left-1;
			maxString = new String(chars, left+1, maxLength);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
