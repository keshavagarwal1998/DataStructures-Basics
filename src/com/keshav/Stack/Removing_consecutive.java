package com.keshav.Stack;// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Removing_consecutive {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String str = br.readLine().trim();
            System.out.println(new solve1().removeConsecutiveDuplicates(str));
        }
    }
}// } Driver Code Ends


class solve1
{
    // Function to print string after removing consecutive duplicates
    public static String removeConsecutiveDuplicates(String str){

        Stack<Character> st = null;
        String abc = "";
        char c = '0';
        int size = str.length();
        int  x= 0;
        while(x+1<=size){
            char z = str.charAt(x);
            if(x+1==size){
                break;
            }
            else {
                c = str.charAt(x + 1);
            }
            if(abc=="") {
                abc = abc + z;
            }
            if(z==c){
                x++;
            }
            else{
                abc = abc + c;
                x++;
            }
        }
        return abc;
        // Your code here
    }
}