package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class array_compare {
	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr1[] =  new int[sizeOfArray];  //array declaration
            int arr2[] =  new int[sizeOfArray];
            for(int i = 0; i < sizeOfArray; i++)
             arr1[i] = sc.nextInt(); //Input the array

            for(int i = 0; i < sizeOfArray; i++)
             arr2[i] = sc.nextInt(); //Input the array             
            array_compare mn = new array_compare();
            mn.testing(arr1,arr2,sizeOfArray);
        }
	}
	public static void testing(int arr1[], int arr2[], int n){
	    int temp =0;
	    HashSet<Integer> hs = new HashSet<Integer>();
	    for (int i = 0 ; i<n ; i++){
	        hs.add(arr1[i]);
        }
	    for(int i = 0 ; i<n ; i++){
	        if(hs.contains(arr2[i])){
	            hs.remove(arr2[i]);
            }
	        else{
	            break;
            }
        }
	    if(hs.size()==0){
	        temp = 1;
        }
	    System.out.println(temp);
	}

    public void testing(int[] arr1, int sizeOfArray) {
    }
}