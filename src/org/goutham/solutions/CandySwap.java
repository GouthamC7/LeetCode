package org.goutham.solutions;

import java.util.HashSet;
import java.util.Set;

public class CandySwap {
	public static int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set = new HashSet<Integer>();
        int totalB = 0,totalA=0;
        for(int i:B) {
        	totalB += i;
        	set.add(i);
        }
        for(int i:A) {
        	totalA +=i;
        }
        for(int i:A) {
        	int temp = totalA-i;
        	int temp1 = totalB+i-temp;
        	if(temp1%2 == 0) {
        		if(set.contains(temp1/2)) return new int[] {i,temp1/2};
        	}
        }
        return new int[] {0,0};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fairCandySwap(new int[] {1,1}, new int[] {2,2} );
	}

}
