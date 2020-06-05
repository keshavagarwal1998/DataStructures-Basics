package com.keshav.hashing;

// { Driver Code Starts
import java.util.*;
class Node5
{
    int data;
    Node next;
    Node5(int d)
    {
        data = d;
        next = null;
    }
}



public class Nth_node_from_end_of_linked_list
{
    Node head;
    Node tail;
    /* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            tail = node;
        } else
        {
            tail.next = node;
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Nth_node_from_end_of_linked_list llist = new Nth_node_from_end_of_linked_list();
            //int n=Integer.parseInt(br.readLine());
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            //System.out.println(llist.head.data);
            GfG5 g = new GfG5();
            //System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head,k));

            t--;
        }
    }
}



// } Driver Code Ends


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG5
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
        int len = 0;
        Node curr = head;
        if(head==null){
            return -1;
        }


        while(curr!= null){
            len++;
            curr = curr.next;
        }
        len = len-n;
        if(len<0 || len>len+n){
            return -1;
        }
        curr = head;
        int count = 0;
        while(count != len){
            curr = curr.next;
            count++;
        }
        return curr.data;
        // Your code here
    }
}
