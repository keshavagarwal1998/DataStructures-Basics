package com.keshav.string;

import java.util.HashSet;
import java.util.Scanner;

public class MinimumIndexedCharacter {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            t--;

            String s1=sc.next();
            String s2=sc.next();

            new solve1().solution(s1, s2);
            System.out.println();
        }
    }
}


class solve1{
    public static void solution(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int i = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(i = 0 ; i<n ; i++){
            hs.add((int) s2.charAt(i));
        }
        for(i = 0 ; i<m ; i++) {
            if (hs.contains((int)s1.charAt(i))) {
                break;
            }
        }
        if(i<m){
                System.out.print(s1.charAt(i));
            }
        else {
                System.out.print("No character present");
            }

    }
}


// { Driver Code Starts.


// } Driver Code Ends