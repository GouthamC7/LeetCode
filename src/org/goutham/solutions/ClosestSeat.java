package org.goutham.solutions;

public class ClosestSeat {
	
	public static int maxDistToClosest(int[] seats) {
        int max = 0, left = -1;
        for(int i=0;i<seats.length;i++) {
            if(seats[i] == 1) {
                if(left == -1) {
                    max = i;
                    
                } else {
                    max = Math.max(max, (i-(left+1))/2+1);
                }
                left = i;
            }
            
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxDistToClosest(new int[] {1,0,0,1});
	}

}
