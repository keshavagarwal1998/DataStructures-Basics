package com.keshav.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Intersection_sorted_arrays
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
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
            for(int i = 0; i < M; i++)
                arr2[i] = Integer.parseInt(st[i]);
                
           new Intersection().printIntersection(arr1, arr2, N, M);
           System.out.println();
        }
    }
}


class Intersection
{

    static void printIntersection(int arr1[], int arr2[], int n, int m) 
    {
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1] ){
                i++;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }

}

