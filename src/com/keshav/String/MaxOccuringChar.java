package com.keshav.String;
import java.lang.*;
import java.io.*;
public class MaxOccuringChar {


    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine().trim());

        while(tc-- >0)
        {
            String line=br.readLine().trim();

            MaxOccur obj = new MaxOccur();

            System.out.println(obj.getMaxOccuringChar(line));

        }
    }
}// } Driver Code Ends


class MaxOccur{

    // Function to get maximum occuring
    // character in given string str
    public static char getMaxOccuringChar(String line){
        int count[] = new int[256];

        for(int i = 0 ; i<line.length() ; i++){
            count[line.charAt(i)]++;
        }
        int max = -1;
        char cha = '0';

        for(int i =0 ; i<line.length() ; i++){
            if(max<=count[line.charAt(i)]){
                if(max == count[line.charAt(i)] ){
                    cha = (char) Math.min(line.charAt(i),cha);
                }
                else {
                    max = count[line.charAt(i)];
                    cha = line.charAt(i);
                }
            }
        }
        return cha;

        // Your code here

    }

}

