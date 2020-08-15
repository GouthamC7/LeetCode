package org.goutham.solutions;

import java.util.Stack;

class MinStack {
    
    int min = Integer.MAX_VALUE;
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minstack = new Stack<Integer>();

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(x<min) min = x;
        minstack.push(min);
    }
    
    public void pop() {
    	stack.pop();
    	minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    	return minstack.peek();
    }
}
