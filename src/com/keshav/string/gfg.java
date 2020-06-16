package com.keshav.string;

import java.util.*;
import java.io.*;
import java.lang.*;

class modify_string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            String a = sc.next();
            System.out.println(new solve().modified(a));
        }
    }
}// } Driver Code Ends


class solve{
    public static long modified(String a){
        int same = 1;
        long ans = 0;
        for(int i = 0 ; i<a.length()-1 ; i++){
            if(a.charAt(i+1)==a.charAt(i)){
                same++;
            }
            else{
                ans =ans+ (same - 1) / 2;
                same = 1;
            }
        }
        // Your code here
        return ans;
    }
}