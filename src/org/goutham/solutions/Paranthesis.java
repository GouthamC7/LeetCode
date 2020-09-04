package org.goutham.solutions;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
	
	public List<String> generateParenthesis(int n) {
		List<String> resultList = new ArrayList<String>();
		backtracking(resultList, "", 0, 0, n);
		return resultList;
    }
	
	public void backtracking(List<String> resultList, String current,int open,int close,int max) {
		if(current.length() == max*2) {
			resultList.add(current);
			return;
		}
		if(open<max) backtracking(resultList, current+"(", open+1, close, max);
		if(close<open) backtracking(resultList, current+")", open, close+1, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generateParenthesis(3);
	}

}
