package com.keshav.hashing;

import java.util.HashMap;
import java.util.Scanner;

class Find_the_sum_of_the_subarray {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();


		while(t-- >0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0 ; i<n ; i++){
				arr[i] = sc.nextInt();
			}
			Find_the_sum_of_the_subarray mn = new Find_the_sum_of_the_subarray();
			mn.testing(arr,n);

		}
		//code
	}
	public void testing(int arr[],int n){
		HashMap<Integer,Integer> hs = new HashMap<Integer, Integer>();
		int pre_sum = 0;
		int count = 0;
		for(int i = 0 ; i<n ; i++){
			pre_sum = pre_sum+arr[i];
			if(hs.containsKey(pre_sum)){

				count = count + hs.get(pre_sum);
				hs.put(pre_sum,hs.get(pre_sum)+1);
			}
			else if(pre_sum==0){
				count++;
			}
			else{
				hs.put(pre_sum,1);

			}

		}
		System.out.print(count);
	}
	
}