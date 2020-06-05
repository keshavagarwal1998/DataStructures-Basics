package com.keshav.string;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Isomorphic {



        public static void main(String[] args)throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());
            while(tc-->0)
            {
                String s1 = br.readLine();
                String s2 = br.readLine();

                Isomorphic1 obj = new Isomorphic1();

                boolean a = obj.areIsomorphic(s1,s2);
                if(a)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }

    }
// } Driver Code Ends


    class Isomorphic1{
        // This function returns true if str1 and str2 are ismorphic
        // else returns false
        public static boolean areIsomorphic(String S1,String S2)
        {
            int a1[] = new int[256];
            int a2[] = new int[256];

            Arrays.fill(a1,0);
            Arrays.fill(a2,0);

            if(S1.length()!=S2.length()){
                return false;
            }

            for(int i = 0 ; i<S1.length() ; i++){
                if(a1[S1.charAt(i)]==0){
                    if(a2[S2.charAt(i)]!=0){
                        return false;
                    }
                    a1[S1.charAt(i)]=S2.charAt(i);
                    a2[S2.charAt(i)]=1;
                }
                else{
                    if(a1[S1.charAt(i)]!=S2.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
            // Your code here

        }
    }

