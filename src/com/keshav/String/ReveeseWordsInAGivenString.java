package com.keshav.String;


import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class ReveeseWordsInAGivenString {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int test = sc.nextInt();
            while (test > 0) {
                String s = sc.next();

                Reverse obj = new Reverse();
                obj.reverseWords(s);
                System.out.println();

                test--;
            }
        }
    }
// } Driver Code Ends


    class Reverse {

        public static void reverseWords(String sd) {
            String str[]=sd.split("\\.");

            for(int i =str.length-1 ; i>=0 ; i--){
                if(i==0){
                    System.out.print(str[i]);
                }
                else{
                    System.out.print(str[i]+".");
                }
            }


            // Your code here
        }
    }

