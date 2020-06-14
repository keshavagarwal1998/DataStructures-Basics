package com.keshav.matrix;


import java.io.*;

class Snake_pattern
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
            new Snake_Pattern1();
			Snake_Pattern1.print(a, n);
            System.out.println();
        }
    }
}


class Snake_Pattern1
{
   
    static void print(int a[][], int n)
    {
        {
    for(int i = 0 ; i<n ; i++){
        if(i%2==0){
            for(int j = 0 ; j<n ; j++){
                System.out.print(a[i][j]+" ");
            }
        }
        else{
            for(int j = n-1 ; j>=0 ; j--){
                System.out.print(a[i][j]+" ");
            }
        }
    }
        
    }
}
}
