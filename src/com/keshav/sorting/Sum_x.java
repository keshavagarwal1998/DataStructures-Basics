package com.keshav.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Sum_x
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    int arr[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(new sorting.TripletSum().find3Numbers(arr, n, x));
		}
	}
}

class TripletSum
{

    public static int find3Numbers(int A[], int n, int x) {

        Arrays.sort(A);
        int low = 0 ;
        int high = n-1;
        int temp = 0;
        while(low<high){
            for(int index = low+1 ; index<high-1 ;index++){
                if(A[index]+A[low]+A[high]>x){
                    high--;
                }
                else if(A[index]+A[low]+A[high]<x){
                    low++;
                }
                else if(A[index]+A[low]+A[high]==x){
                    temp = 1;
                }
            }
        }
        return temp;

    }
}
