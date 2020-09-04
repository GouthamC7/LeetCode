package org.goutham.solutions;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "123";
		String num2 = "50";
		int n1=0,n2=0;
		for(char ch: num1.toCharArray()) {
			n1 = n1*10+(ch-'0');
		}
		for(char ch: num2.toCharArray()) {
			n2 = n2*10+(ch-'0');
		}
		System.out.print(n1);
	}

}
