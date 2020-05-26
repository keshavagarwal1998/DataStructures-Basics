package com.keshav.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class anagram {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Anagram obj = new Anagram();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Anagram{    
    /*  Function to check if two strings are anagram
    *   c, d: input string
    */
    public static boolean isAnagram(String s1,String s2)
    {
    	if(s1.length() != s2.length()){
    		return false;
		}
        int count[] = new int[265];
        for(int i = 0 ; i<265 ; i++){
        	count[i] = -1;
		}
		for(int i = 0 ; i<s1.length() ; i++){
			count[s1.charAt(i)]++;
		}
		for(int i = 0 ; i<s2.length() ; i++){
			count[s2.charAt(i)]--;
		}
		for(int i = 0 ; i<265 ; i++){
			if(count[i]>-1){
				return false;
			}
		}

        return true;
        
        // Your code here
        
    }
}