package com.keshav.matrix.rows;

import java.lang.*;
import java.util.*;

public class Exchange_rows {
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
                ModifyMat mn = new ModifyMat();
                mn.interchangeRows(n1, m1, arr1);
                for(int i = 0; i < n1; i++)
                {
                    for(int j = 0; j < m1; j++)
                        System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

class ModifyMat
{
    static void interchangeRows(int n1, int m1, int arr1[][])
    {
        for(int i = 0 ; i<m1 ; i++){
            for(int j = 0 ; j<n1/2 ; j++){
                int temp = arr1[j][i];
                arr1[j][i] = arr1[n1-1-j][i];
                arr1[n1-1-j][i] = temp;
            }
        }
    }
}



