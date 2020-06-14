package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class digits_123 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		while(testcases-- > 0)
		{
			int sizeOfArray = sc.nextInt(); //size input
			int arr1[] =  new int[sizeOfArray];  //array declaration
			for(int i = 0; i < sizeOfArray; i++)
				arr1[i] = sc.nextInt(); //Input the array

			digits_123 mn = new digits_123();//method calling
			mn.testing(arr1 ,sizeOfArray);
		}
	}
	public static void testing(int arr[],int size){
		HashSet<Integer> hm = new HashSet<Integer>();
		for (int j = 0 ; j<size ; j++){
			hm.add(arr[j]);
		}
		for(int i = 0 ; i<size ; i++){
			int k = arr[i]/10;
			int n = arr[i]%10;
			if(n==1 || n==2 || n==3){
				System.out.print((k*10+n)+" ");
			}
		}
	}
}