package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Evaluate_postfix {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            System.out.println(new solve123().evaluatePostFix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class solve123{
    public static int evaluatePostFix(String exp){
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0 ; i<exp.length() ; i++){
            if(exp.charAt(i) == '*' || (exp.charAt(i) == '/') || (exp.charAt(i) == '+') || (exp.charAt(i) == '-')){
                int a = st.peek();
                st.pop();
                int b = st.peek();
                st.pop();
                if(exp.charAt(i)=='+'){
                    st.push(a+b);
                }
                if(exp.charAt(i)=='-'){
                    st.push(b-a);
                }
                if(exp.charAt(i)=='*'){
                    st.push(a*b);
                }
                if(exp.charAt(i)=='/'){
                    st.push(a/b);
                }
            }
            else {
                st.push((int) exp.charAt(i)-'0');
            }
        }

        return st.peek();
    }

}