package org.goutham.solutions;

import java.util.HashMap;
import java.util.Map;

public class BullsCows {
	
public static String getHint(String secret, String guess) {
	int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        int s = Character.getNumericValue(secret.charAt(i));
        int g = Character.getNumericValue(guess.charAt(i));
        if (s == g) bulls++;
        else {
            if (numbers[s] < 0) cows++;
            if (numbers[g] > 0) cows++;
            numbers[s] ++;
            numbers[g] --;
        }
    }
    return bulls + "A" + cows + "B";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getHint("1123", "0111");
	}

}
