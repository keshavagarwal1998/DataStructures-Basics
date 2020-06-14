package com.keshav.string;

import java.lang.*;
import java.io.*;


 // } Driver Code Ends


class Pangram
{
    public static boolean checkPanagram  (String s)
    {
    	int fre[] = new int[26];
    	for(int i = 0 ; i<s.length() ; i++){
    		if(s.charAt(i) !=' '&& s.charAt(i) != ',') {
				char c = Character.toLowerCase(s.charAt(i));
				int index = c - 97;
				fre[index]++;
			}
		}

    	for(int i = 0 ; i<26 ; i++){
    		if(fre[i]==0){
    			return false;
			}
		}
        // your code here
		return true;
    }

}

// { Driver Code Starts.

class Pangram1
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new string.Pangram().checkPanagram (s)==true?1:0);
	  }
	  
	 }
}