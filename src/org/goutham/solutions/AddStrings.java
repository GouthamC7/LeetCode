package org.goutham.solutions;


public class AddStrings {
	
public static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder sb= new StringBuilder();
        int res = 0;
        while(i>=0 || j>=0) {
        	res = 0;
        	if(i>=0) res = res+num1.charAt(i--)-48;
        	if(j>=0) res = res+num2.charAt(j--)-48;
        	res=res+carry;
        	if(res<10) {
        		sb.append(res);
        		carry=0;
        	}
        	else {
        		sb.append(res-10);
        		carry = 1;
        	}
        }
        if(carry == 1) sb.append(1);
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "121";
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(1));
		System.out.println(addStrings("121", "221"));
	}

}
