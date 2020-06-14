package com.keshav.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Counting012
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    new sorting.Sort012().segragate012(arr, n);
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

class Sort012
{
    public static void segragate012(int A[], int n){
        int low = 0 ;
        int mid = 0 ;
        int high = n-1;
        int temp = 0;
        while(low<=high){
        
        if(mid==0){
            temp = A[mid];
            mid = A[low];
            low = temp;
            low++;
            mid++;
        }
        else if(mid==1){
            mid++;
        }
        else{
            temp = A[mid];
            mid = A[high];
            high = temp;
            high--;
        }
    }
        
        
    }

    
}