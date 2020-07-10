package org.goutham.solutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                n /= 10;
                sum += (digit * digit);
            }
            n = sum;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        return true;
    }
	
	/**
	 * A happy number is a number defined by the following process: 
	 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
	 * and repeat the process until the number equals 1 (where it will stay),
	 * or it loops endlessly in a cycle which does not include 1.
	 * Those numbers for which this process ends in 1 are happy numbers.
	 * Input: 19
	 * Output: true
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));

	}

}
