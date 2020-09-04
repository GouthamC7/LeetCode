package org.goutham.solutions;

public class LemonadeChange {
	
	public boolean lemonadeChange(int[] bills) {
		int five = 0, ten = 0;
		for(int bill:bills) {
			if(bill == 5) five++;
			else if (bill == 10) {
				if(five == 0) return false;
				five--;
				ten++;
			} else {
				if(ten>0) {
					ten--;
					if(five == 0) return false;
					five--;
				} else {
					if(five<3) return false;
					five = five-3;
				}
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
