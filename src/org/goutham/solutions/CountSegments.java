package org.goutham.solutions;

public class CountSegments {
	
	public static int countSegments(String s) {
        int count = 0;
        int a = 0;
        for(int i=0;i<s.length();i++) {
            if((char)s.charAt(i) != ' ') a = 1;
            else {
            	if(a==1) {
            		a=0;
            		count++;
            	}
            }
        }
        return count+a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countSegments("   cx        a"));
	}

}
