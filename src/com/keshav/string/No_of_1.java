package string;
import java.util.*;
import java.lang.*;
import java.io.*;

public class No_of_1 {

        public static Scanner sc = new Scanner(System.in);
        public static void main (String[] args){
            int t;
            t=sc.nextInt();
            sc.nextLine();
            while((t--)!=0){
                int n=sc.nextInt();
                sc.nextLine();
                String s = new String();
                s=sc.nextLine();
                string.StringBinary obj = new string.StringBinary();
                System.out.println(obj.binarySubstring(n, s));
            }
        }
    }// } Driver Code Ends


/*  Function to count the number of substrings
 *   starting and ending with 1
 *   n: size of string
 *   a: input string
 */
class StringBinary{
    public static int binarySubstring(int a, String str)
    {
        int answer = 0;
        int count = 0 ;
        for(int i = 0 ; i<a ; i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        answer = count*(count-1)/2;
        return answer;
        // Your code here
    }
}

