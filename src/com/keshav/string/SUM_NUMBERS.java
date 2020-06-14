package string;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SUM_NUMBERS {

        public static void main (String[] args) throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st=new StringTokenizer(br.readLine());
            int t=Integer.parseInt(st.nextToken());
            while(t-->0){
                String s=br.readLine();

                string.SumNumbers obj = new string.SumNumbers();

                System.out.println(obj.findSum(s));
            }

        }
    }
// } Driver Code Ends


class SumNumbers{
    // Function to find the sum of all
    // the numbers in the given string s
    public static long findSum(String s){
        String  num = "";
        int sum = 0 ;
        for(int i = 0 ; i<s.length(); i++){
           if(Character.isDigit(s.charAt(i)) && i<s.length()-1){
               num = num + s.charAt(i);
           }
           else{
               if(!num.equals("")) {
                   sum = sum + Integer.parseInt(num);
                   num = "";
               }

           }
           if(Character.isDigit(s.charAt(i)) && i==s.length()){
               if(Character.isDigit(s.charAt(i))){
                   num = num + s.charAt(i);
               }
               else{
                   if(!num.equals("")) {
                       sum = sum + Integer.parseInt(num);
                       num = "";
                   }

               }
           }
        }
        if(!num.equals("")) {
            sum = sum + Integer.parseInt(num);
            num = "";
        }
        // your code here
        return sum;
        }



}
