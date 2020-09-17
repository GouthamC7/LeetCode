package org.goutham.solutions;

public class TrappingRain {
	public static int[] calculateRainWater(int[] a) {
		int[] temp = new int[a.length];
		temp[0] = a[0];
		int result = 0;
		for(int i =1; i<temp.length;i++) temp[i] = Math.max(temp[i-1], a[i]);
		int[] temp1 = new int[a.length];
		temp1[a.length-1] = a[a.length-1];
		for(int i =a.length-2; i>=0;i--) {
			temp1[i] = Math.max(temp1[i+1], a[i]);
		}
		for(int i =1; i<temp.length-1;i++) {
			result +=  Math.min(temp[i], temp1[i])-a[i];
		}
		System.out.print(result);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateRainWater(new int[] {3,0,0,2,0,4});
	}

}
