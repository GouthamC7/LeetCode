package org.goutham.solutions;

public class SharesBuySell {
	
    public static int maxProfit(int[] p) {
    	int res = 0;
        for(int i = 1; i < p.length; i++) if(p[i] > p[i-1]) res += p[i]-p[i-1];
        return res;
    }
    
    /**
     * Design an algorithm to find the maximum profit. 
     * You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
     * Input: [7,1,5,3,6,4]
	 * Output: 7
	 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     *       Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * @param args
     */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {1,2,3,4,5}));

	}

}
