package com.keshav.sorting;

import java.util.*;
import java.io.*;
import java.lang.*;

public class UnionofTwoSortedArrays {
    // { Driver Code Starts
//Initial Template for Java


        public static void main(String args[])throws IOException
        {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t  =Integer.parseInt(read.readLine());

            while(t-- > 0)
            {
                String st[] = read.readLine().trim().split(" ");
                int N = Integer.parseInt(st[0]);
                int M = Integer.parseInt(st[1]);

                int arr1[] = new int[N];
                int arr2[] = new int[M];

                st = read.readLine().trim().split(" ");
                for(int i = 0; i < N; i++)
                    arr1[i] = Integer.parseInt(st[i]);

                st = read.readLine().trim().split(" ");
                for(int i = 0; i< M; i++)
                    arr2[i] = Integer.parseInt(st[i]);

                Union obj = new Union();
                obj.findUnion(arr1, arr2, N, M);
                System.out.println();
            }
        }
    }


// } Driver Code Ends
//User function Template for Java

    //arr1,arr2 : the arrays
// n, m: size of arrays
    class Union
    {

        static void findUnion(int arr1[], int arr2[], int n, int m)
        {
            int i = 0, j = 0;
            while (i < n && j < m)
            {

                System.out.print(".......q......."+(i+1<n&&arr1[i]==arr1[i+1]));

                while(i+1<n&&arr1[i]==arr1[i+1])
                {
                    i++;
                }
                System.out.print(".......z......."+(j+1<m&&arr2[j]==arr2[j+1]));
                while(j+1<m&&arr2[j]==arr2[j+1])
                {
                    j++;
                }

                if (arr1[i] < arr2[j])
                    System.out.print(arr1[i++]+ " ");

                else if (arr2[j] < arr1[i])
                    System.out.print(arr2[j++]+" ");

                else
                {
                    System.out.print(arr2[j++]+" ");
                    i++;
                }
            }



            while(i < n)
            {
                System.out.print(".......i......."+i);

                System.out.print(".......n......."+n);
                while(i+1<n&&arr1[i]==arr1[i+1])
                    i++;
                System.out.print(arr1[i++]+" ");
            }

            while(j < m)
            {
                System.out.print(".......j......."+j);

                System.out.print(".......m......."+m);
                while(j+1<m&&arr2[j]==arr2[j+1])
                    j++;
                System.out.print(arr2[j++]+ " ");
            }
            // add your code here
        }
    }





