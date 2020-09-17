package org.goutham.solutions;


public class LargestNumberString {
	
	
	
	public static void findLargest(String[] a,int i,String current, String largest) {
		if(i==a.length) return;
		for (int j = i; j < a.length; j++) {
			current = current+a[j];
			if(current.compareTo(largest)>0 ) largest = current;
			findLargest(a, j+1, current, largest);
			current= current.replace(a[j], "");
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargest(new String[] {"3", "30", "34", "5", "9"}, 0, "", "0");
	}

}
