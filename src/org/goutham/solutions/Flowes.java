package org.goutham.solutions;

public class Flowes {
	
	public static boolean canPlaceFlowers(int[] a, int n) {
        int count = 0;
        int ad = Math.abs(-6);
        for(int i=0;i<a.length;i++) {
            if(a[i]==1) continue;
            if(i-1<0 && a[i+1]!=1) {
                count++;
                i++;
            } else if (i+1==a.length && a[i-1]!=1) {
                count++;
                i++;
            } else if(i-1>=0 && i+1<a.length) {
                if(a[i-1] !=1 && a[i+1]!=1) {
                    count++;
                    i++;
                }
            }else {
                
            }
        }
        
        
        return count-n>=0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canPlaceFlowers(new int[] {1,0,0,0,1,0,0}, 2);
	}

}
