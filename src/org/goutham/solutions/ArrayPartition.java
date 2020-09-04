package org.goutham.solutions;

public class ArrayPartition {
	
    public boolean canThreePartsEqualSum(int[] A) {
    	int sum=0;
        for(int a:A) {
        	sum +=a;
        }
        if(sum%3!=0) return false;
        int i=0,j=A.length-1;
        int temp = 0, count =0;
        while(i<=j) {
        	temp +=A[i];
        	if(temp == sum/3) {
        		count++;
        		if(count == 3) break;
        		temp=0;
        	}
        	i++;
        }
        temp = 0;
        while(++i<=j) {
        	temp+=A[i];
        }
        if(count == 3 && temp == 0) return true;
        else return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
