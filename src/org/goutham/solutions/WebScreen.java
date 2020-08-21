package org.goutham.solutions;

public class WebScreen {
	
public int[] constructRectangle(int area) {
        for(int i=(int) (Math.sqrt(area)+1);i>0;i++) {
        	if(area%i == 0) {
        		if(i>=area/i)
        		return new int[] {i, area/i};
        		else return new int[] {area/i, i};
        	}
        }
        return new int[] {0,0};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
