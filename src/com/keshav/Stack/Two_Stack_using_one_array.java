package com.keshav.Stack;// { Driver Code Starts
import java.util.*;

class Two_Stack_using_one_array
{

    int size;
    int top1,top2;
    //int arr[] = new int[size];
    int arr[] = new int[100];

    Two_Stack_using_one_array()
    {
        int n =100;
        size = n;
        //arr[] = new int[n];
        top1 = -1;
        top2 = size;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            Two_Stack_using_one_array sq = new Two_Stack_using_one_array();

            int Q = sc.nextInt();
            while(Q>0)
            {
                int stack_no = sc.nextInt();
                int QueryType = sc.nextInt();

                Stacks g = new Stacks();

                if(QueryType == 1)
                {
                    int a = sc.nextInt();
                    if(stack_no == 1)
                        g.push1(a,sq);
                    else if(stack_no ==2)
                        g.push2(a,sq);
                }else if(QueryType == 2)
                {
                    if(stack_no==1)
                        System.out.print(g.pop1(sq)+" ");
                    else if(stack_no==2)
                        System.out.print(g.pop2(sq)+" ");
                }

                Q--;
            }
            System.out.println();
            T--;
        }
    }
}

// } Driver Code Ends


/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    void push1(int x, Two_Stack_using_one_array sq)
    {
        if(sq.top1<sq.top2-1){
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
    }

    /* The method push to push element into the stack 2*/
    void push2(int x, Two_Stack_using_one_array sq)
    {
        if(sq.top1<sq.top2-1){
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
    }

    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(Two_Stack_using_one_array sq)
    {
        if(sq.top1>-1){
            int temp = sq.arr[sq.top1];
            sq.top1--;
            return temp;
        }
        else {
            return -1;
        }
    }

    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(Two_Stack_using_one_array sq)
    {
        if(sq.top2<sq.size){
            int temp = sq.arr[sq.top2];
            sq.top2++;
            return temp;
        }
        else {
            return -1;
        }
    }
}

