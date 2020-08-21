package org.goutham.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Heaters {
	
public static int findRadius(int[] houses, int[] heaters) {
	Arrays.sort(heaters);
    int n = heaters.length;
    int result = 0;
    for (int house : houses) {
        int idx = Arrays.binarySearch(heaters, house);
        if (idx < 0) {
            idx = ~idx;
            if (idx == 0) {
                result = Math.max(result, heaters[0] - house);
            } else if (idx == n) {
                result = Math.max(result, house - heaters[n - 1]);
            } else {
                result = Math.max(result, Math.min(house - heaters[idx - 1], heaters[idx] - house));
            }
        }
    }
    return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findRadius(new int[] {1 ,2,3,4},new int[] {1 ,4});
	}
	

}
