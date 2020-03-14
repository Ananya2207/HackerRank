package hackerrank;

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day15LinkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
        
        if(head==null)
        {
            Node newNode=new Node(data);
            newNode.next=null;
            return newNode;
        }
        else
        {
            Node newNode=new Node(data);
            newNode.next=null;
            Node itr=head;
            
            while(itr.next!=null)
            {
            itr=itr.next;
            }
            itr.next=newNode;
            return head;
        }
        
        //return null;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
