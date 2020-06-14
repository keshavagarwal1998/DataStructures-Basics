package com.keshav.matrix;

import java.lang.*;
import java.util.*;

public class Reverse_columns {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t-- > 0)
            {
                int n1 = sc.nextInt();
                int m1 = sc.nextInt();

                int arr1[][] = new int[n1][m1];

                for(int i = 0; i < n1; i++)
                {
                    for(int j = 0; j < m1; j++)
                        arr1[i][j] = sc.nextInt();
                }
                ModifyMat1 mn = new ModifyMat1();
                mn.reverseCol(n1, m1, arr1);
                for(int i = 0; i < n1; i++)
                {
                    for(int j = 0; j < m1; j++)
                        System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


class ModifyMat1
{
    static void reverseCol(int n1, int m1, int arr1[][])
    {
        for(int i = 0 ; i<n1 ; i++){
            for(int j =0 ; j<m1/2; j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[i][m1-1-j];
                arr1[i][m1-1-j] = temp;
            }
        }
    }
}

