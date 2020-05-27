package com.keshav.sorting;

import java.util.*;
import java.io.*;
public class Bubblesort {


        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i=0;i<n;i++)
                {
                    arr[i] = sc.nextInt();
                }

                bubbleSort(arr,n);
                printArray(arr);

                t--;
            }
        }
        static void bubbleSort(int arr[], int n)
        {
            int i, j;
            for (i = 0; i < n-1; i++)
                new BubbleSort().bubble(arr, i, n);
        }
    }// } Driver Code Ends
//User function Template for Java

/* The task is to complete bubble() which is used
   in below bubbleSort() */

    /* A function to implement bubble sort
    void bubbleSort(int arr[], int n)
    {
       for (int i = 0; i < n-1; i++)
            bubble(arr, i, n);
    } */
    class BubbleSort
    {
        static void bubble(int arr[], int i, int n)
        {

            int temp = 0;
            for(int j = 0 ; j<n-i-1 ; j++ ){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            // add your code here
        }
    }

