package string;

import java.util.*;
import java.lang.*;
import java.io.*;

class Remove_common {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            string.RemoveCommon obj = new string.RemoveCommon();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}
// } Driver Code Ends


class RemoveCommon{
    
    // Function which concatenate two strings
    // after removing common characters
    public static String concatenatedString(String s1,String s2){
        boolean count1[] = new boolean[256];
        String s3 = "";
        for(int i = 0 ; i<s1.length() ; i++){
            count1[s1.charAt(i)] = true;
        }
        boolean count2[] = new boolean[256];
        for(int i = 0 ; i<s2.length() ; i++){
            count2[s2.charAt(i)] = true;
        }

        for(int i = 0 ;i<s1.length() ; i++){
            char ch = s1.charAt(i);
            if(count1[ch] && !count2[ch]){
                s3 = s3+ch;
            }
        }
        for(int i = 0 ;i<s2.length() ; i++){
            char ch = s2.charAt(i);
            if(!count1[ch] && count2[ch]){
                s3 = s3+ch;
            }
        }

        if(s3.length()==0){
            return "-1";
        }
        return s3;
        // Your code here

    }
}
