package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;

public class LargeGroup {
	
    public List<List<Integer>> largeGroupPositions(String S) {
    	int counter[] = new int[S.length()];
    	List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        int i=0,j=1,highest = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(j<S.length()) {
        	while(S.charAt(i) == S.charAt(j)) j++;
        	if(j-i >=3) {
        		highest = Math.max(highest, j-i);
        		i=j;
        		counter[i] = 1;
        		counter[j-1] = 2;
        	}
        	j++;
        }
        if(j-i>=3) {
        	highest = Math.max(highest, j-i);
        	counter[i] = 1;
    		counter[j-1] = 2;
        }
        for(i=0;i<counter.length;i++) {
        	if(counter[i] == 1) {
        		j=i+1;
        		while(counter[j] !=2) j++;
        		if(j-i+1 == highest) {
        			list.add(i);
        			list.add(j);
        			resultList.add(list);
        		}
        	}
        }
        return resultList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
