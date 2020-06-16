package com.keshav.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class powerpairs
{
    	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            
            int[] x = new int[n];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< n;i++)
                x[i] = Integer.parseInt(str[i]);
                
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[m];
            for(int i = 0;i< m;i++)
            {
                y[i] = Integer.parseInt(str[i]);
                
            }
            System.out.println(new Num_of_pair().countPairs(x, y, n, m));
           
        }
	}
}

class Num_of_pair
{
    static long countPairs(int x[], int y[], int n, int m)
    {
    int i = 0 ;
    int j = 0 ;
    long count = 0 ;
    while((i<=m) || (j<=n)){
        if (i == n) {
            break;
        }
        int a = (int) Math.pow(x[i],y[j]);
        int b = (int) Math.pow(y[j],x[i]);



        if(b < a) {
            count++;
            j++;
        }
        else{
            j++;
        }
        if(j==m) {
            i++;
            j = 0;
        }
            
        }
    
    return count;
    }
}
