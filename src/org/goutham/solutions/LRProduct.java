package org.goutham.solutions;

public class LRProduct {
	
	public static int[] calculateProduct(int[] a) {
		int[] temp = new int[a.length];
		temp[0] = 1;
		for(int i =1; i<temp.length;i++) temp[i] = a[i-1]*temp[i-1];
		int[] temp1 = new int[a.length];
		temp1[a.length-1] = 1;
		for(int i =a.length-2; i>=0;i--) temp1[i] = a[i+1]*temp1[i+1];
		for(int i =0; i<temp.length;i++) {
			a[i] = temp[i]*temp1[i];
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateProduct(new int[] {1,2,3,4,5});
	}

}
