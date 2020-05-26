package com.keshav.String;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CheckIfIsomorphicOrNot {


        // } Driver Code Ends


        //This is a function problem
        static boolean isIsogram(String data){
            boolean count[] = new boolean[265];

            for(int i = 0 ; i < data.length() ; i++){
                if(count[data.charAt(i)]==true){
                    return false;
                }
                else{
                    count[data.charAt(i)]=true;
                }
            }
            return true;
            //Your code here
        }

        // { Driver Code Starts.
        public static void main (String[] args) throws Exception
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            while(testCase-- > 0)
            {
                String data = br.readLine();
                System.out.println(isIsogram(data)?"1":"0");

            }

    }  // } Driver Code Ends
}
