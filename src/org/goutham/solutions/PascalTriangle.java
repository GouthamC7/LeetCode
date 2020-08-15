package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
public static List<List<Integer>> generate(int numRows) {
        
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	if(numRows == 1) {
		list.add(new ArrayList<Integer>(1));
	}
	list.add(new ArrayList<Integer>(1));
	List<Integer> temp = new ArrayList<Integer>(1); 
	for(int i=0;i<numRows;i++) {
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(1);
		for(int j=1;j<temp.size();j++) {
			temp1.add(temp.get(i-1)+temp.get(i));
		}
		temp1.add(1);
		temp = temp1;
	}
	return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
