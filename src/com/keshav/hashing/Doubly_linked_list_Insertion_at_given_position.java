package com.keshav.hashing;
// { Driver Code Starts
import java.util.*;

class Node13
{
    int data;
    Node next;
    Node prev;
    Node13(int data)
    {
        this.data = data;
        next = prev = null;
    }
}

class DLinkedList
{

    Node newNode(Node head, int data)
    {
        Node n = new Node(data);
        if(head == null)
        {
            head = n;
            return head;
        }
        head.next = n;
        n.prev = head;
        head = n;
        return head;
    }


    void printList(Node node)
    {
        Node temp = node;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        while(temp.prev != null)
        {
            temp = temp.prev;
        }

        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DLinkedList DLL = new DLinkedList();
        int t = sc.nextInt();

        while(t>0)
        {
            Node temp;
            Node head = null;
            Node root = null;
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int x = sc.nextInt();
                head = DLL.newNode(head,x);
                if(root == null)    root = head;
            }
            head = root;
            int pos = sc.nextInt();
            int data = sc.nextInt();

            GfG10 g = new GfG10();
            g.addNode(head,pos,data);

            DLL.printList(head);
            while(head.next != null)
            {
                temp = head;
                head = head.next;
            }
            t--;
        }
    }
}// } Driver Code Ends


/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG10
{
    void addNode(Node head_ref, int pos, int data)
    {
        Node temp = new Node(data);
        Node curr = head_ref;
        while(pos!=0){
            curr = curr.next;
            pos--;
        }
        if(curr.next!=null){
            temp.next = curr.next;
            curr.next=	temp;
            temp.prev = curr;
            temp.next.prev = temp;
        }
        else{
            temp.next = curr.next;
            curr.next = temp;
            temp.prev = curr;
        }
        // Your code here
    }
}