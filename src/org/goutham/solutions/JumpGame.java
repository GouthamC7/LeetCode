package org.goutham.solutions;

public class JumpGame {
	
	public static boolean canjump(int a[], int currentIndex) {
		int dp[] = new int[a.length];
		int longjump = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			if(a[i] == 0) {
				if(i == a.length-1) return false;
				if(a[i+1] != 1) return false;
			}
			if(i+a[i]-1 <= longjump) continue;
			 else {
				longjump = i+a[i]-1;
				if(longjump >= a.length) return true;
				for(int j=i;j<=longjump;j++) {
					dp[j] = 1;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(canjump(new int[] {3,2,1,0,4}, 0));
	}

}
