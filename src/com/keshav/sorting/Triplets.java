package com.keshav.sorting;

import java.util.Arrays;
import java.util.Scanner;

class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			sorting.Triplet g=new sorting.Triplet();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}

class Triplet
{
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        boolean b1 = false;
        
        for(int i = 0 ; i<n-2 ; i++){
            int k = i+2;
            int j = i+1;
            while(j<n){
                if(k<n && arr[i]+arr[j]+arr[k]==0){
                    b1 = true;
                    break;
                }
                else{
                    k++;
                }
                if(k==n){
                    j++;
                    k = j+1;
                }
                
            }
            break;
        }
        return b1;
    }
}