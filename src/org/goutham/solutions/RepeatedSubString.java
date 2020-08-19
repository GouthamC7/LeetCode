package org.goutham.solutions;

public class RepeatedSubString {
	
public static boolean repeatedSubstringPattern(String s) {
	if(s.replaceAll(s.substring(0, 1), "").equals("")) return true;
      for(int i=2;i<s.length()/2+1;i++) {
    	  if(s.length()%i == 0) {
    		  String temp = s;
    		  temp = temp.replaceAll(temp.substring(0, i), "");
    		  if(temp.equals("")) return true;
    	  }
      }
      return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hammingDistance(93,73);
		repeatedSubstringPattern("ababa");
	}
	
public static int hammingDistance(int x, int y) {
        int len = (int) (x > y ?Math.log(x) / Math.log(2):Math.log(y) / Math.log(2));
        int i=0,count = 0;
        String first = convertToLog(x,len+1);
        String second = convertToLog(y,len+1);
        while(i<len+1) {
        	if(first.charAt(i) == second.charAt(i)) count++;
        	i++;
        }
        return count;
    }
    
    public static String convertToLog(int num,int len) {
        StringBuilder s = new StringBuilder();
        while(num>0){
            s.append(num%2);
            num = num/2;
        }
        while(s.length() <= len) {
        	s.append("0");
        }
        return s.reverse().toString();
    }

}
