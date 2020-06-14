package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class remove_duplicate {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String str = br.readLine().trim();
            String ans=new solve11().removePair(str);
            if(ans.length()<=0)
                System.out.println("Empty String");

            else
                System.out.println(ans);
        }
    }
}// } Driver Code Ends


class solve11
{
    // Function to print string after removing consecutive duplicates
    public static String removePair(String str){
        Stack<Character> st = new Stack<Character>();
        for(int i = 0 ; i<str.length() ; i++){
            if(!st.isEmpty() && st.peek()==str.charAt(i)){
                st.pop();
                }
            else{
                st.push(str.charAt(i));
            }
        }

        String s = "";
        if(!st.isEmpty()){
            s = s+st.peek();
            st.pop();
        }
        else{
            return "EMPTY STRING";
        }

        return s;
        // your code here
    }
}