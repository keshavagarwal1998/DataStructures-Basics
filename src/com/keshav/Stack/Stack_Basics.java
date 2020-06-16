package com.keshav.Stack;// { Driver Code Starts
//Initial Template for Java
import java.util.*;


// } Driver Code Ends


//User function Template for Java

//User function Template for Java

// Helper class to implement functions
// insert : to insert element to stack
// remove : to pop element from stack
// headOf_Stack : to return top of stack
// find : to find the element in stack
class Stack_Basics
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
        // Your code here

    }

    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {

        int x = st.pop();// Your code here

    }

    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        // Your code here
        System.out.println(st.peek() + " ");
    }

    // Function to find the element in stack
    public static boolean find(Stack<Integer> st, int val)
    {
        boolean exists = false;

        while(st.size()>0){
            if(st.peek()==val){
                exists = true;
                st.pop();
            }
            else{
                st.pop();
            }
        }
        if(exists == true){
            return true;
        }
        else{
            return false;
        }

    }
}


// { Driver Code Starts.

// Driver class with Driver code
class GFG
{
    // Driver code
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // Declaring stack of integers
            Stack <Integer> st = new Stack<Integer>();

            int q = sc.nextInt();

            // Working with queries
            while(q-- > 0)
            {
                char ch = sc.next().charAt(0);
                Stack_Basics obj = new Stack_Basics();
                if(ch == 'i')
                {
                    int x = sc.nextInt();
                    obj.insert(st, x);
                }

                if(ch == 'r')
                {
                    obj.remove(st);
                }

                if(ch == 'h')
                {
                    obj.headOf_Stack(st);
                }
                if(ch == 'f')
                {
                    int x = sc.nextInt();
                    if(obj.find(st, x))
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
}  // } Driver Code Ends