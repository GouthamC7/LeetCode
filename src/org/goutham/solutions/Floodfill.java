package org.goutham.solutions;

public class Floodfill {
	
	public static void fill(int[][] a, int prev, int val,int i, int j) {
		
		if(a[i][j] == prev) {
			a[i][j] = val;
			if(i-1>=0) fill(a, prev, val, i-1, j);
			if(i+1<=a.length-1) fill(a, prev, val, i+1, j);
			if(j-1>=0) fill(a, prev, val, i, j-1);
			if(j+1<=a[0].length-1) fill(a, prev, val, i, j+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int[][] {{1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 0, 0},
				{1, 0, 0, 1, 1, 0, 1, 1},
				{1, 2, 2, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 0, 1, 0},
				{1, 1, 1, 2, 2, 2, 2, 0},
				{1, 1, 1, 1, 1, 2, 1, 1},
				{1, 1, 1, 1, 1, 2, 2, 1},
				 };
				 
				 
		fill(a, a[4][4],3,4,4);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
	}

}
