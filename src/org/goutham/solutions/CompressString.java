package org.goutham.solutions;

public class CompressString {
	
	public static int compress(char[] chars) {
        if(chars.length<2) return chars.length;
        int count = 0;
        int modify = 1;
        char current = chars[0];
        int result = 0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i] == current) count++;
            else {
                if(count == 1) {
                	result = result+1;
                }
                else if(count<10) {
                	chars[modify++] = (char)((count)+'0');
                	result = result+2;
                }
                else {
                	chars[modify++] = (char)((count)+'0');
                	result = result+3;
                }
                current = chars[i];
                chars[modify++] = current;
                count = 1;
            }
        }
        if(count == 1) result = result+1;
        else if(count<10) {
        	chars[modify++] = (char)((count)+'0');
        	result = result+2;
        }
        else {
        	chars[modify++] = (char)((count)+'0');
        	result = result+3;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compress(new char[] {'a','a','b','b','b','b','c','c'});
	}

}
