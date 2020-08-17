package org.goutham.solutions;

public class UglyNumber {
	
	public static boolean isUgly(int num) {
		int n = 6^4^2^3^5^7^0^1^9;
        if(num == 1) return true;
        while(num > 5 || num < -5) {
            if(num%2==0) num = num/2;
            else if(num%3 == 0) num = num/3;
            else if(num%5 == 0) num = num/5;
            else return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstBadVersion(5);
		isUgly(-2147483648);
	}
	
	public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
        int mid = start + (end-start) / 2;
        if (true) start = mid + 1;
        else end = mid;            
    }        
    return start;
    }

}
