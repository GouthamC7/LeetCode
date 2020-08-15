package org.goutham.solutions;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2, 5, 6}, 3);

	}
	
	public static void merge(int[] a, int m, int[] b, int n) {
        int i =0;
        int j = 0;
        int temp;
        while(a[i] != 0) {
            if(a[i] <= b[j]) {
                i++;
                continue;
            } else {
                temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                while( j< n-1 && a[j] >= a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    j++;
                }
                j=0;
            }
            i++;
        }
        for(i=m; i<a.length; i++) {
            a[i] = b[j++];
        }
    }

}
