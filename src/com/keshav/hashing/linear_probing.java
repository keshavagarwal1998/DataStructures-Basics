package com.keshav.hashing;

import java.util.Scanner;

class linear_probing {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();

            int arr[] = new int[array_size];
            for (int i = 0; i < array_size; i++)
                arr[i] = sc.nextInt();

            int hash_table[] = new int[hash_size];
            for (int i = 0; i < hash_size; i++)
                hash_table[i] = -1;

            linearProbing(hash_table, hash_size, arr, array_size);

            for (int i = 0; i < hash_size; i++)
                System.out.print(hash_table[i] + " ");

            System.out.println();

        }
    }

    // } Driver Code Ends


    //Complete this function
    static void linearProbing(int hash_table[], int hash_size, int arr[], int array_size) {
        for (int i = 0; i < array_size; i++)//Iterating over the array
        {
            if (hash_table[arr[i] % hash_size] == -1)//If the place is empty then insert arr[i] at that place
            {
                hash_table[arr[i] % hash_size] = arr[i];
            } else {//else linearly move from the filled position to find an empty place. Mod by hashSize ensures that we remain inside the hashTable
                int counter = 0;
                int k = (1 + arr[i]) % hash_size;
                while (counter < hash_size && hash_table[k] != -1) {
                    k = (k + 1) % hash_size;
                    counter++;
                }
                if (counter < hash_size)//If we find a position where arr[i] can be inserted then we insert
                    hash_table[k] = arr[i];
            }
        }
    }
}