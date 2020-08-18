package org.goutham.solutions;

public class NumtoHex {
	
	public static String toHex(int num) {
        StringBuilder s = new StringBuilder();
        while(num > 0) {
            int rem = num%16;
            char c = (char) ('a'+(rem-10));
            if(rem<10) s.append(String.valueOf(rem));
            else s.append(c);
            num/=16;
        }
        s.reverse();
        return s.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toHex(255));
	}

}
