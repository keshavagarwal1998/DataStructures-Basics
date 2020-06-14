package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection_arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
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

            Intersection_arrays mn = new Intersection_arrays();
            mn.testing(arr1,n1,arr2,n2);
        }
    }

    public static void testing(int arr1[],int n1,int arr2[],int n2){
        HashSet<Integer> hs = new HashSet<Integer>();
        int count = 0;
        for(int i=0;i<n1;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(hs.contains(arr2[i])){
                count++;
                hs.remove(arr2[i]);
            }
            else{
                i++;
            }
        }
        System.out.print(count);

    }

}
