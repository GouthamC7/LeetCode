package org.goutham.solutions;

public class DpLongestPalindrome {
	
	public static void find(String s) {
		String res = "";
        int[][] arr = new int[s.length()][s.length()];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i][i] = 1;
            res= s.substring(i, i+1);
		}
		for (int i = 0; i < arr.length-2; i++) {
            int j=i+1;
			if(s.charAt(j) == s.charAt(i)) {
                arr[i][j] = 1;
                res= s.substring(i, j+1);
            }
		}
		for (int k = 3; k <= arr.length; ++k) { 
			  
            // Fix the starting index 
            for (int i = 0; i < arr.length - k + 1; ++i) { 
                // Get the ending index of substring from 
                // starting index i and length k 
                int j = i + k - 1; 
                if(arr[i+1][j-1] == 1 && s.charAt(j) == s.charAt(i)) {
                	res = s.substring(i, i+k);
                	arr[i][j] = 1;
                }
            }
		}
        System.out.print(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find("a");
	}

}
