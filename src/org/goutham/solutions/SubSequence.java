package org.goutham.solutions;

public class SubSequence {
	
	public static boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else j++;
        }
        return i == s.length();
    }
	
	public boolean isSubsequence1(String s, String t) {
        int idx = 0;
        for (char c : s.toCharArray()) {
            idx = t.indexOf(c, idx);
            if (idx++ < 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		isSubsequence("axc", "ahbgdc");
	}

}
