package com.keshav.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


class FrequencyOfNumberOfDigits
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			    new Sorting().sortByFreq(arr, size);
			    System.out.println();
			n--;
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Sorting
{
    static void sortByFreq(int arr[], int n)
    {
    	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	for(int i = 0 ; i<n ; i++){
    		if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
    		else{
    			hm.put(arr[i],1);
			}
		}
    	

		}
        // add your code here
    }
