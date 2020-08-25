package org.goutham.solutions;

public class ShortestDistance {
	
	//[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0] e
	
    public static int[] shortestToChar(String S, char C) {
    	int[] result = new int[S.length()];
        int i=0;
        int counter = 1;
        while(S.charAt(i) != C)i++;
        while(i<S.length()) {
        	if(S.charAt(i) == C) {
        		result[i] = 0;
        		counter =1;
        	} else {
        		result[i] = counter++;
        	}
        	i++;
        }
        i = S.length()-1;
        while(S.charAt(i) != C) i--;
        while(i>=0) {
        	if(S.charAt(i) == C) {
        		counter =1;
        	} else {
        		if(result[i] > counter || result[i] == 0) 
        		result[i] = counter++;
        	}
        	i--;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shortestToChar("loveleetcode", 'e');
	}

}
