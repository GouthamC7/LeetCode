package org.goutham.solutions;

public class LongestCommonSS {
	
	public static void findLCSS(String s1, String s2) {
		int max =0;
		int index = 0;
		int[][] arr = new int[s1.length()][s2.length()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[0].length; j++) {
				if(s1.charAt(i) == s1.charAt(j)) {
					if(i-1 >=0 && j-1>=0) {
						arr[i][j] = arr[i-1][j-1] +1;
						if(arr[i][j] > max) {
							max = arr[i][j];
							index = j;
						}
					} else {
						arr[i][j] = 1;
					}
				}
				
			}
			
		}
		System.out.println("max = "+max+"   ------- index = "+index);
		System.out.println(s1.substring(index-max+1, index+1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLCSS("gadadj8", "bouthan");
	}

}
