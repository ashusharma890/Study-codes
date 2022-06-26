package com.company;
import java.util.*;
public class Main {
    Node head; //declaring head node

    private int size; //used to get size of list

    Main()
    {
        this.size=0;
    }

    // Node class/ blue-print
    class Node{
        String data;//value inside linkedlist
        Node next;//next node's pointer

        Node(String data) //Node Constructor
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
     //add node/data first/last

    //add first
    public void addFirst(String data)
    {
        Node newNode= new Node(data); //creation of new node
        if(head==null) //checking if head is present or not
        {
           head=newNode;// if not , creating a new node as head
           return;
        }

        newNode.next=head; //if head is present, the node added points toward head node & becomes the new head node
        head=newNode; //the prev head node becomes next node after new head node
    }

    //add Last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode= head;//creating a new node for traversal as head cannot be trifled with to avoid data loss
        while(currNode.next!=null)//traversing till the next doesn't point to null
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //printing the list
    public void printList()
    {
        if(head==null)//checking if list is empty
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;//creating a new node for traversal as head cannot be trifled with to avoid data loss
        while(currNode !=null)//traversing till the next doesn't point to null
        {
            System.out.print(currNode.data+ "-> ");
            currNode=currNode.next;
        }
        System.out.println("NULL"); //end point / null point reached
    }

    //delete first
    public  void deleteFirst()
    {
        if (head==null)
        {
            System.out.println("list is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast()
    {
        if (head==null) // corner case
        {
            System.out.println("list is empty");
            return;
        }
        size--;

        if (head.next==null) //corner case if only 1 node present
        {
            head=null;
        }
        Node secondLast=head; // to traverse
        Node lastNode=head.next;//to traverse & delete last node
        while (lastNode.next != null) //condition for traversing total list
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //getting size of list
    public int sizeOflList()
    {
        return size;
    }

    public static void main(String[] args) {
        Main list=new Main();// linked list object of class
        list.addFirst("Hi");
        list.addLast("Hello");
        list.addLast("Namaste");
        list.addLast("Bonjour");
        list.addLast("Bella Ciao");
        list.addLast("Mon amour");
        list.printList();
        System.out.println(list.sizeOflList());
    }
    }
