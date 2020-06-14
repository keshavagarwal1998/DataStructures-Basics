package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Infix_to_postfix {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            System.out.println(new solve112().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class solve112{
    public static String infixToPostfix(String exp) {
        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();
        String abc="";
        for(int i = 0 ; i<exp.length() ; i++){
            if(exp.charAt(i)!='^' && exp.charAt(i)!='/' && exp.charAt(i)!='*' && exp.charAt(i)!='+' && exp.charAt(i)!='-' && exp.charAt(i)!='(' && exp.charAt(i)!=')'){
                st1.push(exp.charAt(i));
            }
            else{
                if(st2.isEmpty()) {
                    st2.push(exp.charAt(i));
                    continue;
                }
                if(st2.peek()=='-' && exp.charAt(i)=='+'){
                    st2.pop();
                    st1.push('-');
                    st2.push('+');
                }
                else if(st2.peek()=='+' && exp.charAt(i)=='-'){
                    st2.pop();
                    st1.push('+');
                    st2.push('-');
                }
                else if(st2.peek()=='*' && exp.charAt(i)=='/'){
                    st2.pop();
                    st1.push('*');
                    st2.push('/');
                }
                else if(st2.peek()=='/' && exp.charAt(i)=='*'){
                    st2.pop();
                    st1.push('/');
                    st2.push('*');
                }
                else if(st2.peek()=='^' && (exp.charAt(i)=='^' || exp.charAt(i)=='/' || exp.charAt(i)=='*' || exp.charAt(i)=='+' || exp.charAt(i)=='-')){
                    st2.pop();
                    st1.push('^');
                    st2.push(exp.charAt(i));
                }
                else if(st2.peek()=='/' &&  (exp.charAt(i)=='/' || exp.charAt(i)=='*' || exp.charAt(i)=='+' || exp.charAt(i)=='-')){
                    st2.pop();
                    st1.push('/');
                    st2.push(exp.charAt(i));
                }
                else if(st2.peek()=='*' && (exp.charAt(i)=='*' || exp.charAt(i)=='+' || exp.charAt(i)=='-')){
                    st2.pop();
                    st1.push('*');
                    st2.push(exp.charAt(i));
                }
                else if(st2.peek()=='+' &&  (exp.charAt(i)=='+' || exp.charAt(i)=='-')){
                    st2.pop();
                    st1.push('+');
                    st2.push(exp.charAt(i));
                }
                else if(st2.peek()=='-' &&  (exp.charAt(i)=='-')){
                    st2.pop();
                    st1.push('-');
                    st2.push(exp.charAt(i));
                }
                else if(exp.charAt(i)=='('){
                    st2.push(exp.charAt(i));
                }
                else if(exp.charAt(i)==')'){
                    while(st2.peek()!='('){
                        st1.push(st2.peek());
                        st2.pop();
                    }
                    st2.pop();
                }
                else{
                    st2.push(exp.charAt(i));
                }
            }

        }
        for(int j = 0 ; j<st1.size() ; j++){
            abc = abc + st1.pop();
        }
        for(int j = 0 ; j<st2.size() ; j++){
            abc = abc + st2.pop();
        }
        // Your code here
        return abc;
    }
}