package com.keshav.Queue;
import java.util.*;
import java.io.*;
class Reverse_Queue {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            Queue<Integer> q=new LinkedList<>();
            String s=br.readLine();
            String[] a=s.split(" ");
            for(String b:a){
                int x=Integer.parseInt(b);
                q.add(x);
            }
            GfG1 g=new GfG1();
            q=g.rev(q);
            while(!q.isEmpty()){
                int x=q.peek();
                q.poll();
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java
/*Complete the function below*/
class GfG1{
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st1 = new Stack<Integer>();
        while(!q.isEmpty()){
            st1.push(q.remove());
        }
        while(!st1.isEmpty()){

            q.add(st1.pop());
        }
        return q;
    }
}