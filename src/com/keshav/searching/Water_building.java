package com.keshav.searching;

// Java implementation of the approach 
import java.util.Arrays; 
import java.util.*;

class Water_building {


 // } Driver Code Ends





//User function Template for Java

// Return the maximum water that can be stored 
static int maxWater(int height[], int n) 
{ 
    int i = 0 ; 
    int j = n-1;
    int compare = 0;
    while(i<j){
        if(height[i]<height[j]){
            compare = Math.max(compare,(j-1-i)*height[i]);
            i++;
        }
        else if(height[i]>height[j]){
            
            compare = Math.max(compare,(j-1-i)*height[j]);
            j--;
        }
        else{
            compare = Math.max(compare,(j-1-i)*height[i]);
            i++;
            j--;
        }
    }
    return compare;
    //Your code here
} 



// { Driver Code Starts.


	// Driver code 
	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int height[]=new int[n];
	        for(int i=0;i<n;i++)
	        height[i]=sc.nextInt();
	        System.out.println(maxWater(height, n)); 
	    }
	

		
	} 
} 
  // } Driver Code Ends