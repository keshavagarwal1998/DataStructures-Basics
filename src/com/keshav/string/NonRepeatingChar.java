package com.keshav.string;

import java.lang.*;
import java.util.*;

public class NonRepeatingChar {

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                String st = sc.next();

                char ans=new Repeatation().nonrepeatingCharacter(st);

                if(ans!='$')
                    System.out.println(ans);
                else
                    System.out.println(-1);
            }
        }
    }
// } Driver Code Ends


//User function Template for Java

    class Repeatation
    {
        static char nonrepeatingCharacter(String S)
        {
            int count[]=new int[265];
            int i = 0;
            int j = 0;
            while(i<S.length()){
                count[S.charAt(i)]++;
                i++;
            }
            while(j<S.length()){
                if(count[S.charAt(j)]==1){
                    return S.charAt(j);
                }
                j++;
            }

            return '$';
            //Your code here
        }
    }



