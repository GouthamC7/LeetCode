package org.goutham.solutions;

import java.util.Arrays;

public class ArrayNegotiations {
	
	//[1,2,22,-23,-9,-30,-6,-9,1,8,24,2,21,29,10,-25,18,30,1,9,-8,-11,-22,-23,-17,-12,19,28,19,28]
	
	
    public static int largestSumAfterKNegations(int[] A, int K) {
        int recent = Integer.MIN_VALUE, sum = 0, small = 0;
        Arrays.sort(A);
        int i=0;
        	while(A[i]<=1 && K!=0) {
            	recent = i;
            	A[i] = -A[i];
            	K--;
            	i++;
            }
        	if(K!=0) {
        		if(recent == Integer.MIN_VALUE) {
        			small = 0;
        		} else {
        			if(A[recent] < A[i]) small = recent;
        			else small = i;
        		}
        		for(int j=0;j<K;j++) {
        			A[small] = -A[small];
        		}
        	}
        	for(int k:A) sum+=k;
        	return sum;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestSumAfterKNegations(new int[] {1,2,22,-23,-9,-30,-6,-9,1,8,24,2,21,29,10,-25,18,30,1,9,-8,-11,-22,-23,-17,-12,19,28,19,28},24);
	}

}
