package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class PositiveNeg_pair {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();


		while(t-- >0){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0 ; i<n ; i++){
				arr[i] = sc.nextInt();
			}
			PositiveNeg_pair mn = new PositiveNeg_pair();
			mn.testing(arr,n);

		}
		//code
	}

	private void testing(int[] arr, int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int flag = 0;
		for(int i =0 ; i<n ; i++){
			if(hs.contains(-arr[i])){
				System.out.println(arr[i]+" "+(-arr[i]));
				flag = 1;
			}
			else if (hs.contains(-arr[i])==false){
				hs.add(arr[i]);
			}
			if(flag == 0 && i == n-1){
				System.out.print(0);
			}

		}
	}
}