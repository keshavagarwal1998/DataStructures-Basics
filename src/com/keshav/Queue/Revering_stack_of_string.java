package com.keshav.Queue;

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
    }
}
// } Driver Code Ends



class Solution {

    public void reverse(String str){
        Stack<Character> st1 = new Stack<Character>();
        for(int i = 0; i<str.length() ; i++){
            st1.push(str.charAt(i));
        }
        while(!st1.isEmpty()){
            System.out.print(st1.pop());
        }
        //your code here
    }

}
