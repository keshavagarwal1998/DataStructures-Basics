package com.keshav.matrix;

import java.util.*;

class Multiply_the_matrices
{
    public static void main (String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			
			while(t-- > 0)
			{
			    int n1 = sc.nextInt();
			    int m1 = sc.nextInt();
			    
			    int arr1[][] = new int[n1][m1];
			    for(int i = 0; i< n1; i++)
			    {
			        for(int j = 0; j < m1; j++)
			            arr1[i][j] = sc.nextInt();
			    }
			    int n2 = sc.nextInt();
			    int m2 = sc.nextInt();
			    
			    int arr2[][] = new int[n2][m2];
			    for(int i = 0; i < n2; i++)
			    {
			        for(int j = 0; j < m2; j++)
			            arr2[i][j] =sc.nextInt();
			    }
			    
			    new Multiplication();
				Multiplication.multiplyMatrix(n1, m1, n2, m2, arr1, arr2);
			    
			    System.out.println();
			    
			}
		}
    }
}


class Multiplication
{
  
    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
        if(m1 != n2){
        System.out.print("-1");
    }
    else{
        int mul = 0;
        for(int i = 0 ; i<n1 ; i++){
            for(int j = 0 ; j < m2 ; j++){
                for(int k = 0  ; k<m1 ; k++){
                    mul += arr1[i][k]*arr2[k][j];
                }
                System.out.print(mul+" ");
                mul = 0;
            }
            
        }
        
    }
        
    }
}