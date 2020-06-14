package com.keshav.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class non_repeated_count
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];

            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);


            new Hashing().printNonRepeated(arr, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Hashing
{
    static void printNonRepeated(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put((arr[i]), hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1) {
                System.out.print(hm.get(arr[i]));
            }
        }

        // add your code here
    }
}

