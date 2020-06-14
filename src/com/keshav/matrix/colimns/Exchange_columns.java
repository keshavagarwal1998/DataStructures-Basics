package com.keshav.matrix.colimns;

import java.lang.*;
import java.util.*;

class Exchange_columns
{
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
            ModifyMat mn=new ModifyMat();
            mn.exchangeColumns(n1, m1, arr1);
            System.out.println();
        }
    }
}


class ModifyMat
{

    static void exchangeColumns(int n1, int m1, int arr1[][])
    {
        int temp = 0;
        for(int i = 0 ; i<n1 ; i++){
            temp = arr1[i][m1-1];
            arr1[i][m1-1] = arr1[i][0];
            arr1[i][0] = temp;
        }

        for(int i = 0 ; i<n1 ; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }
    }
}
