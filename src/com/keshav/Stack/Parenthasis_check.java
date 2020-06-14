package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Parenthasis_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- >0)
        {
            String st = sc.next();
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}// } Driver Code Ends


class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0 ; i<x.length() ; i++){
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='['){
                st.push(x.charAt(i));
            }
            else if((st.peek()=='(' && x.charAt(i)==')') || (st.peek()=='{' && x.charAt(i)=='}') || (st.peek()=='[' && x.charAt(i)==']') ){
                st.pop();
            }
            else{
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
        // add your code here
    }
}