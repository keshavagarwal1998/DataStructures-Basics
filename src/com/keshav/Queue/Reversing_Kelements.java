package com.keshav.Queue;

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack<Integer> st = new Stack<Integer>();
        int arr[] = new int[q.size()-k];
        while(k!=0){
            st.push(q.remove());
            k--;
        }
        int i = 0;
        while(!q.isEmpty()){
            arr[i] = q.remove();
            i++;
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        int j = 0;
        while (j!=arr.length){
            q.add(arr[j]);
            j++;
        }

        return q;
        //add code here.
    }
}

