package org.goutham.solutions;

public class License {
public static String licenseKeyFormatting(String S, int K) {
	StringBuilder sBuilder = new StringBuilder();
	int count = 0;
        for(int i = S.length()-1;i>=0;i--) {
        	if(count == K && S.charAt(i)!='-') {
        		sBuilder.append("-");
        		count = 0;
        	}
        	if(S.charAt(i)!='-') {
        		sBuilder.append(S.charAt(i));
        		count++;
        	}
        	
        }
        return sBuilder.reverse().toString().toUpperCase();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
		 
	}

}
