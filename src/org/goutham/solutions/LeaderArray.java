package org.goutham.solutions;

public class LeaderArray {
	
	public static void leader(int[] a) {
		int greater = Integer.MIN_VALUE;
		for (int i = a.length-1; i >=0; i--) {
			if(a[i]>=greater) {
				System.out.println(a[i]);
				greater = a[i];
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leader(new int[] {7,4,5,7,3});
	}

}
