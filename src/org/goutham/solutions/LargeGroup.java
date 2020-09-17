package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;

public class LargeGroup {
	
    public static List<List<Integer>> largeGroupPositions(String S) {
    	int counter[] = new int[S.length()];
    	List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        int i=0,j=1,highest = 0;
        int count = 1;
        
        while(j<S.length()) {
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	count = 1;
        	while(S.charAt(i) == S.charAt(j)) {
        		j++;
        		count++;
        	}
        	if(count >= 3) {
        		list.add(i);
        		list.add(i+count-1);
        		resultList.add(list);
        	}
        	i=j++;
        }
        if(count >= 3) {
    		List<Integer> list = null;
			list.add(i);
    		list.add(i+count-1);
    		resultList.add(list);
    		
    	}
        return resultList;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largeGroupPositions("abcdddeeeeaabbbcd");
	}

}
