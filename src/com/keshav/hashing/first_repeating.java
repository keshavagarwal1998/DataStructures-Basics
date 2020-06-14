package com.keshav.hashing;

import java.util.HashMap;
import java.util.Scanner;

class first_repeating {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();


	    while(t-- >0){
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i = 0 ; i<n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        first_repeating mn = new first_repeating();
	        mn.testing(arr,n);

	    }
		//code
	}

	public static void testing(int arr[],int n){
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0 ; i<n ; i++){
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i] + 1));
			}
			else{
				hm.put(arr[i],1);
			}
		}

		for(int i = 0 ; i<n ; i++){
			if(hm.get(arr[i])>1){
				System.out.print(arr[i]);
			}
		}
	}
}