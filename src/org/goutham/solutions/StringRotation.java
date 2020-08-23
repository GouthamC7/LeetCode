package org.goutham.solutions;

public class StringRotation {
	public static boolean rotateString(String A, String B) {
        int i=0,j=1;
        while(j<B.length()) {
        	if(A.contains(B.substring(i, j)))j++;
        	else break;
        }
        if(j>=B.length()) return true;
        System.out.println(B.substring(j, B.length()-1));
    	if(A.contains(B.substring(j, B.length()-1))) return true;
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateString("abcde", "cdeab");
	}

}
