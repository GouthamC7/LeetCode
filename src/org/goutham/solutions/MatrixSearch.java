package org.goutham.solutions;

public class MatrixSearch {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        int length = matrix[0].length-1;
        int row = -1;
        while(top<bottom) {
        	int mid = (top + bottom)/2;
        	if(matrix[mid][0] == target) return true;
        	else if (target < matrix[mid][0]) bottom = mid-1;
        	else {
        		if(target > matrix[mid][0] && target<= matrix[mid][length]) {
        			row = mid;
        			break;
        		} else {
        			top = mid + 1;
        		}
        	}
        }
        if(row == -1) row = top;
        top = 0; 
        bottom = length;
        while(top <= bottom) {
        	int mid = (top + bottom)/2;
        	if(matrix[row][mid] == target) return true;
        	else if (matrix[row][mid] > target) bottom = mid-1;
        	else top = mid+1;
        }
        return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchMatrix(new int[][] {
  {1,   3,  5,  7},
  {10, 11, 16, 20},
  {23, 30, 34, 50}
}, 3);
	}

}
