package org.goutham.solutions;

public class Equilibriumpoint {
	
	public static int findEquilibrium(int[] a) {
		int[] temp = new int[a.length];
		temp[0] = 0;
		for(int i =1; i<temp.length;i++) temp[i] = a[i-1]+temp[i-1];
		int[] temp1 = new int[a.length];
		temp1[a.length-1] = 0;
		for(int i =a.length-2; i>=0;i--) temp1[i] = a[i+1]+temp1[i+1];
		for(int i =1; i<temp.length;i++) {
			if(temp[i] == temp1[i]) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(findEquilibrium(new int[] {1,3,5,2,2}));
	}

}
