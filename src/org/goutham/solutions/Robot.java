package org.goutham.solutions;

public class Robot {
	
	public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for(char ch: moves.toCharArray()) {
        	if(ch == 'U') {
        		if(down>0) down--;
        		else up++;
        	}
        	else if (ch == 'D') {
        		if(up>0) up--;
        		else down++;
        	}
        	else if(ch == 'L') {
        		if(right >0) right--;
        		else left++;
        	} else {
        		if(left > 0) left--;
        		else right++;
        	}
        }
        return left ==0 && right ==0 && up == 0 && down == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
