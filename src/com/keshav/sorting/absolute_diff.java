package com.keshav.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class absolute_diff
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int x = Integer.parseInt(inputLine[1]);
		    
		    int arr[] =  new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    new SortABS().sortABS(arr,n, x);
		    System.out.println();
		}
	}
}

class SortABS
{
    static void sortABS(int arr[], int n,int k)
    {
        Arrays.sort(arr);
        int b[] = new int[n];
        int c[] = new int[n];
        int position = 0;
        
        for(int i = 0 ; i<n ; i++){
            b[i] = Math.abs(arr[i]-k);
        }
        
        for(int i = 0 ; i<n ; i++){
            c[i] = b[i];
        }
        
        Arrays.sort(c);
        
        for(int i = 0 ; i<=n ; i++){

            for(int j = 0 ; j<n ; j++){
                if(i==n){
                    break;
                }
                if(c[i]==b[j]){
                    c[i] = arr[j];
                    i++;
                    b[j] = Integer.MAX_VALUE;
                    j= -1;
                }
            }
        }

        for(int i : c)
        System.out.print(i);
    }
}
