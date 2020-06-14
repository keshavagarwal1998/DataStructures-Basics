package com.keshav.hashing;

import java.util.Scanner;

class quad_probing
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();

            int arr[] = new int[array_size];

            for(int i = 0; i < array_size; i++)
                arr[i] = sc.nextInt();

            int hash_table[] = new int[hash_size];

            for(int i = 0; i < hash_size; i++)
                hash_table[i] = -1;

            quadraticProbing(hash_table, hash_size, arr, array_size);

            for(int i = 0; i <hash_size; i++)
                System.out.print(hash_table[i] + " ");

            System.out.println();

        }
    }


    // } Driver Code Ends


    static void quadraticProbing(int hash_table[], int hash_size, int arr[], int array_size)
    {
        int temp = 0 ;
        for(int i = 0 ; i<array_size ; i++){
            temp = arr[i]%hash_size;
            if(hash_table[temp]== -1){
                hash_table[temp] = arr[i];
            }
            else{
                int c=0;
                int j =1;
                while((c < hash_size) && (hash_table[temp] != -1)){
                    temp = (int)(Math.pow(j,2)+arr[i])%hash_size;
                    j++;
                }
                if(c < hash_size){
                    hash_table[temp] = arr[i];
                }
            }
        }
        //Your code here
    }

// { Driver Code Starts.
}  // } Driver Code Ends
