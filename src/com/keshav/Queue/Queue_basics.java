package com.keshav.Queue;

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG2 {

    public static void main (String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            int inputN = inputLine.length;
            GfgQueue gq = new GfgQueue();
            try{
                for(int i=0, k=0; i<n; i++){
                    if(inputLine[k].equals("i")){
                        k++;
                        gq.enqueue(Integer.parseInt(inputLine[k]));
                        k++;
                    }
                    if(inputLine[k].equals("h")){
                        k++;
                        System.out.println (gq.front());
                    }
                    if(inputLine[k].equals("r")){
                        k++;
                        gq.dequeue();
                    }
                    if(inputLine[k].equals("f")){
                        k++;
                        System.out.println(gq.find(Integer.parseInt(inputLine[k])));
                        k++;
                    }
                    if(k==inputN)break;
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                continue;
            }
        }
    }
}// } Driver Code Ends


//User function Template for Java
class GfgQueue {
    Queue<Integer> q = new LinkedList<>();;
    void enqueue(int x){
        q.add(x);
        // Code here
    }
    void dequeue(){
        q.remove();
        // code here
    }
    int front(){
        return q.peek();
        // Code here
    }
    String find(int x){
        while(!q.isEmpty()){
            if(x==q.peek()){
                return "Yes";
            }
            else{
                q.remove();
            }
        }
        // Code here
        return "No";
    }
}
