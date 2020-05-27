package com.keshav.sorting;

import java.util.*;
import java.io.*;
import java.lang.*;

public class BinaryArraySorting {
    // { Driver Code Starts
//Initial Template for Java

        public static void main(String args[])throws IOException
        {
            // Scanner sc = new Scanner(System.in);
            // int t = sc.nextInt();
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());

            while(t-- > 0)
            {
                String st[] = read.readLine().trim().split(" ");
                int n =Integer.parseInt(st[0]);

                int arr[] = new int[n];
                st = read.readLine().trim().split(" ");
                for(int i = 0; i < n; i++)
                    arr[i] = Integer.parseInt(st[i]);
                new BinarySort().binSort(arr, n);
                for(Integer x: arr)
                    System.out.print(x + " ");
                System.out.println();
            }
        }
    }


// } Driver Code Ends
//User function Template for Java

    class BinarySort
    {
        static void binSort(int arr[], int n)
        {

            int i,j = 0;
            int temp =0;
            for(i = 0 ; i<n ; i++){
                if(arr[i]==0){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                    j++;
                }
            }
            // add your code here


            /**************
             * No need to print the array
             * ************/
        }
    }



