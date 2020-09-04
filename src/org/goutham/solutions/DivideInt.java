package org.goutham.solutions;

public class DivideInt {
	
	public static int divide(int dividend, int divisor) {
        int sign = 1;
        sign = dividend <0?-sign:sign;
        sign = divisor<0?-sign:sign;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while(dividend - divisor >=divisor) {
            result++;
            dividend = dividend - divisor;
        }
        return sign<0?-result:result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(10, 3);
	}

}
