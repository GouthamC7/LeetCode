package org.goutham.solutions;

import java.util.Stack;

public class BackSpaceStringCompare {
	
	public static boolean backspaceCompare(String S, String T) {
        for(int i=0;i<S.length();i++) {
            if(S.length() <2)
                break;
            if(S.charAt(i) == '#' && i>0) {
                S=S.substring(0,i-1)+S.substring(i+1);
                i = i-2;
            } else if (S.charAt(i) == '#' && i==0){
                S=S.substring(i+1);
                i = i-1;
            } else {
                
            }
        }
        for(int i=0;i<T.length();i++) {
            if(T.length() <2)
                break;
            if(T.charAt(i) == '#' && i>0) {
                T=T.substring(0,i-1)+T.substring(i+1);
                i = i-2;
            } else if (T.charAt(i) == '#' && i==0){
                T=T.substring(i+1);
                i = i-1;
            } else {
                
            }
        }
        return S.equals(T);
    }
	
	/**
	 * Input: S = "ab#c", T = "ad#c"
	 * Output: true
	 * Explanation: Both S and T become "ac".
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(backspaceCompare("abc#", "ac#b"));
	}

}
