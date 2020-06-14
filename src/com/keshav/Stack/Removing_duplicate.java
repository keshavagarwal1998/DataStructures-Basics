package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Removing_duplicates2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String str = br.readLine().trim();
            String ans=new solve().removePair(str);
            if(ans.length()<=0)
                System.out.println("Empty String");

            else
                System.out.println(ans);
        }
    }
}// } Driver Code Ends


class solve
{
    // Function to print string after removing consecutive duplicates
    public static String removePair(String str){
        Stack<Character> st = new Stack<Character>();
        st.push(str.charAt(0));
        for(int i = 1 ; i<str.length() ; i++ ){
            if(!st.isEmpty() && st.peek()==str.charAt(i)){
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
        }
        String abc = "";
        while(!st.isEmpty()){
            abc = st.peek() +abc;
            st.pop();
        }
        return abc;
    }
}