package com.keshav.sorting;

import java.util.Scanner;

class inversion_no
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for(long i = 0; i < n; i++)
                arr[(int)i] = sc.nextLong();

            System.out.println(new Inversion_of_Array().inversionCount(arr, n));

        }
    }
}

class Inversion_of_Array
{
    static long inversionCount(long arr[], long n)
    {
        long temp[] = new long[(int) n];
        return _mergeSort(arr,temp,n,0,n-1);
    }

    static long _mergeSort(long arr[],long temp[],long n,long left,long right) {


        int count = 0;

        if (left < right) {

            long mid = left + (right - left) / 2;

            count = (int) _mergeSort(arr, temp, n, left, mid);
            count += _mergeSort(arr, temp, n, mid + 1, right);
            count += _merge(arr, temp, left, mid, right);
        }
        return count;
    }

        static long _merge ( long[] arr1, long[] temp1, long left1, long mid1, long right1){
            long i = left1;
            long j = mid1;
            long k = left1;
            int count=0;
            while (i < mid1 && j < right1) {
                if(arr1[(int)i]<=arr1[(int)j]) {
                    temp1[(int)k] = arr1[(int)i];
                    k++;
                    i++;
                }
                else if(arr1[(int)i]>=arr1[(int)j]){
                    temp1[(int)k] = arr1[(int)j];
                    k++;
                    j++;
                }
                else{
                    temp1[(int)k] = arr1[(int)i];
                    k++;
                    i++;
                }
            }
            while(i<mid1){
                temp1[(int)k] = arr1[(int)i];
                k++;
                i++;
            }
            while(j<right1){
                temp1[(int)k] = arr1[(int)j];
                k++;
                j++;
            }
            for (int a =0; a<right1;a++){
                if(arr1[a] != temp1[a]){
                    count++;
                }
            }
            return count;
        }

}

