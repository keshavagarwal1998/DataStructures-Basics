package com.keshav.hashing;

import java.util.HashMap;
import java.util.Scanner;

class elections
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            new Election().winner(arr, n);
            
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Election
{
    static void winner(String arr[], int n)
    {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i = 0 ; i<n ; i++){
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        int max = 0;
        for(int i = 0 ; i<n ; i++){
            max = Math.max((hm.get(arr[i])),max);
        }

        for(int i = 0 ; i<n ; i++){
            if(hm.containsValue(max)){
                System.out.print(arr[i]);
            }
        }


        
        // add your code
    }
}

