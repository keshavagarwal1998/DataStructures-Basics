package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class Relative_sorting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while(t-- >0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            for(int i = 0 ; i<n1 ; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i = 0 ; i<n2 ; i++){
                arr2[i] = sc.nextInt();
            }
            Relative_sorting mn = new Relative_sorting();
            mn.testing(arr1,n1,arr2,n2);

        }
        //code
    }

    private void testing(int[] arr1, int n1,int[] arr2, int n2) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for(int i = 0 ; i<n1 ;i++){
            hs1.add(arr1[i]);
        }

        for(int i = 0 ; i<n1 ;i++){
            if(hs1.contains(arr2[i])){
                System.out.print(arr2[i]+" "+arr2[i]);
                hs2.remove(arr2[i]);
            }
            else{

            }
        }
    }
}
