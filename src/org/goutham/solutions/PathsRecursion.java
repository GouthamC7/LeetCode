package org.goutham.solutions;

public class PathsRecursion {
	
	static int res=0;
	
	public static void find(int a[][], int i, int j) {
		if(i>a.length-1 || j > a.length-1) return ;
		if(i==a.length-1 && j == a.length-1) res++ ;
		find(a, i+1, j);
		find(a, i, j+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[3][3], 0, 0);
		System.out.print(res);
	}

}
