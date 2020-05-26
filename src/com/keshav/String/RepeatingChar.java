package com.keshav.String;

import java.io.*;
import java.util.*;
import java.lang.*;


public class RepeatingChar {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                String str = sc.next();
                int index = new Repeatation1().repeatedCharacter(str);
                if(index == -1)
                    System.out.println("-1");
                else
                    System.out.println(str.charAt(index));
            }
        }
    }// } Driver Code Ends


//User function Template for Java

    class Repeatation1
    {
        static int repeatedCharacter(String S)
        {
            int count[]=new int[265];
            for(int i = 0 ; i<S.length() ; i++){
                for(int j = 0 ; j<S.length() ; j++) {
                    if(S.charAt(i)==S.charAt(j)) {
                        count[S.charAt(i)]++;
                    }
                }
                if(count[S.charAt(i)]>=2){
                    return i;
                }
            }

            return -1;
            // add your code here
        }



}
