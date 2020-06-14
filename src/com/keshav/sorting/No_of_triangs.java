package com.keshav.sorting;

import java.util.Arrays;
import java.util.Scanner;

class No_of_triangs
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
            sorting.Count_possible_triangle mn = new sorting.Count_possible_triangle();
             System.out.println(sorting.Count_possible_triangle.findNumberOfTriangles(arr, n));
        }
    }
}

class Count_possible_triangle
{

    static long findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr);
        int count = 0;

        for(int i = 0 ; i<n-2 ; i++){
            int k = i+2;
            int j = i+1;
            while(j<n && k<n) {
                if (k <= n && arr[i] + arr[j]>arr[k]) {
                    count++;
                    k++;
                } else {
                    k++;
                }
                if (k >n-1 ) {
                        j++;
                        k = j + 1;

                }

            }
        }
        return count;

    }
}