package com.keshav.matrix;

import java.io.*;

class Transpose_matrix
{
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int a[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(st[k++]);
            }
            new TransposeMatrix();
			TransposeMatrix.transpose(a, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n;j++)
                    System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}

class TransposeMatrix
{

    static void transpose(int a[][], int n)
    {
        int temp = 0;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        
    }
}