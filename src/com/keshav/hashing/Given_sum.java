package com.keshav.hashing;

import java.util.HashSet;
import java.util.Scanner;

class Given_sum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr[] =  new int[sizeOfArray];  //array declaration
            
            for(int i = 0; i < sizeOfArray; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, sizeOfArray, sum));
        }
    }
}


 // } Driver Code Ends


//User function Template for Java

class Geeks
{
    //Complete this function, Geeks
    public static int sumExists(int arr[], int sizeOfArray, int sum)
    {
        int count = 0;
        int pre_sum = 0;
        int j = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i<sizeOfArray ; i++ ){
            pre_sum = pre_sum + arr[i];
            if(pre_sum == sum){
                count++;
                j++;
                i=j;
                pre_sum = 0;
            }
            else if(hs.contains(pre_sum-sum)){
                count++;
                j++;
                i=j;
                pre_sum = 0;
            }
            else{
                hs.add(arr[i]);
            }
        }
        return count;

    }
}
// { Driver Code Starts.


  // } Driver Code Ends