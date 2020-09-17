package org.goutham.solutions;

public class InversionArray {
	int result = 0;
	
	public static int[] Divide(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			Divide(arr, l, m);
			Divide(arr, m+1, r);
			MergeArrays(arr, l, m, r);
		}
		return arr;
	}

	private static void MergeArrays(int[] a, int l, int m, int r) {
		// TODO Auto-generated method stub
		int length1 = m-l+1;
		int length2 = r-m;
		int left[] = new int[length1];
		int right[] = new int[length2];
		for (int i = 0; i < left.length; i++) {
			left[i] = a[l+i];		
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = a[m+i+1];		
		}
		int i=0, j=0,k=l;
		while(i < length1 && j<length2) {
			if(left[i] <= right[j]) {
				a[k] = left[i];
				k++;
				i++;
			} else {
				a[k] = right[i];
				k++;
				j++;
			}
		}
		
		while (i< length1) a[k++] = left[i++];
		while (j< length2) a[k++] = right[j++];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[] = Divide(new int[] {2,4,1,3,4 }, 0, 4);
		for (int i:res) System.out.println(i);
	}

}
