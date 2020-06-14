package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class subarray_given
{
	public static void main (String[] args)
	 {
    	 Scanner sc=new Scanner(System.in);
    	 int t=sc.nextInt();
    	 while(t-->0)
    	 {
    	        int n = sc.nextInt();
    		    int arr[] = new int[n];
    		    for(int i=0;i<n;i++)
    		    {
    		        arr[i] = sc.nextInt();
    		    }
    		    int sum = sc.nextInt();
    		    System.out.println(new sumRange().subArraySum(arr, n, sum));
    		    
    		}
	}
}// } Driver Code Ends


//User function Template for Java

class sumRange
{
    static int subArraySum(int arr[], int n, int sum)
    {
    	HashSet<Integer> hs = new HashSet<Integer>();
    	int pre_sum = 0;
    	int count = 0;

    	for (int i = 0 ; i<n ; i++){
			pre_sum = pre_sum +arr[i];
			if(pre_sum == sum){
				count++;
			}
    		else if(hs.contains(pre_sum-sum)){
    			count++;
			}
    		else{
    			hs.add(arr[i]);
			}

		}
    	return count;

        // add your code here
    }
}