package org.goutham.solutions;

public class JumpingClouds {
	
	static int jumpingOnClouds(int[] c) {
        int result = 0;
        int i=0;
        while(i<c.length-1) {
            if(i==c.length-2 || i+2<c.length && c[i+2] == 0) {
                result++;
                i = i+2;
            } else {
                result++;
                i++;
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(jumpingOnClouds(new int[] {0,0,1,0,0,1,0}));
	}

}
