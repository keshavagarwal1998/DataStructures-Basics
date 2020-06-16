package com.keshav.string;

import java.util.*;
import java.lang.*;
import java.io.*;

class pattern_search
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = "", p = "";
            s = sc.next();
            p = sc.next();
            
            Search obj = new Search();
            
            if(obj.search(p, s) ==  true)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
    }
}// } Driver Code Ends


class Search{
    
    /*  Function to search pattern in the given string
    *   pat: pattern given in input
    *   txt: string given in the input
    */
    static boolean search(String pat, String txt)
    {
        int n = txt.length();
        int m = pat.length();
        for(int i = 0 ; i<n-m ; i++){
            for(int j = 0 ; j<m ; j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                    break;
                }
                if(j==m-1){
                    return true;
                }
            }
        }
        return false;
            // Your code here
    }
    
}