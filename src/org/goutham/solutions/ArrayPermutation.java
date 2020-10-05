package org.goutham.solutions;

import java.util.ArrayList;

public class ArrayPermutation {
	
	
	
	public static void findPermutations(int[] a, int i, int j) {
		if(i==j) {
			printArray(a);
			return;
		}
		
		for (int k = i; k <=j; k++) {
			if(checkswap(a, k, i)) {
			swap(a, k, i);
			findPermutations(a,i+1,j);
			swap(a, k, i);
			}
		}
	}
	
	private static boolean checkswap(int[] a, int k, int i) {
		// TODO Auto-generated method stub
		return a[k] != a[i];
	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
	}

	public static int[] swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPermutations(new int[] {1,2,3}, 0,2);
	}

}
