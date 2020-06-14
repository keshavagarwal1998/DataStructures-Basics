package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class Sum_0 {
	public static void main (String[] args) {
		//code
			//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		     System.out.println(findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
 // } Driver Code Ends


//Complete this function


static boolean findsum(int arr[],int n)
{
	HashSet<Integer> hs = new HashSet<Integer>();
	int pre_sum = 0;
	for(int i = 0 ; i<n ;i++){
		pre_sum = pre_sum+arr[i];
		if(hs.contains(pre_sum)){
			return true;
		}
		else if(hs.contains(0)){
			return true;
		}
		else{
			hs.add(pre_sum);
		}
	}
	return false;

    //Your code here
}

// { Driver Code Starts.
	
	
}  // } Driver Code Ends