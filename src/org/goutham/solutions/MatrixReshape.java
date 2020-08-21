package org.goutham.solutions;

public class MatrixReshape {
	
public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int rowlength = nums.length;
        int collength = nums[0].length;
        if(r*c != rowlength*collength) return nums;
        int[][] result = new int[r][c];
        int rownum=0,colnum=0;
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		result[i][j] = nums[rownum][colnum++];
        		if(colnum == collength) {
        			rownum++;
        			colnum = 0;
        		}
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[1][4];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2] = 3;
		a[0][3]=4;
		matrixReshape(a, 2,2);
	}

}
