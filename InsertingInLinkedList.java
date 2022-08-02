package com.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static class Node{
        Node next;
        int data;

        public Node( int data) {

            this.data = data;
            next = null;

        }
    }
    public static class LinkedList{
       static Node head ;
       static Node tail;

        static Node create1(){

           Node n1 = new Node(10);
           Node n2 = new Node(20);
           Node n3 = new Node(30);
           Node n4 = new Node(40);
           Node n5 = new Node(50);

           n1.next = n2;
           n2.next = n3;
           n3.next = n4;
           n4.next = n5;
            return n1;
        }
        static Node create2(){
            tail = head;
            System.out.println("Enter the number of nodes you want to enter");

            Scanner sc = new Scanner(System.in);
            int Nodes = sc.nextInt();


            for(int i=0;i<Nodes ;i++){
                System.out.println("Enter the "+i+" "+"element");
                int element = sc.nextInt();
                Node node = new Node(element);
                if(head == null){
                   head = node;
                   tail = head;

                }
                else{
                    tail.next = node;
                    tail = tail.next;

                }
            }
            return head;
        }
      static  void print(Node head){
           tail = head;
           while(tail!=null){
               System.out.print(tail.data+" ");
               tail=tail.next;
           }
       }

        static void insert(int data , int position){
            tail = head;
            Node node = new Node(data);
            if(head==null){
                head = node;
                tail = head;
            }
            else{
                for(int i=0;i<position-1;i++){
                    tail = tail.next;
                }
                node.next = tail.next;
                tail.next = node;
            }
        }


        public static void main(String[] args) {
            Node head = create2();
            print(head);
            System.out.println();
            System.out.println("Enter the data you want to enter");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            System.out.println("Enter the position at which you want to enter");
            int position = sc.nextInt();
            System.out.println("After Inserting");
            insert(data,position);
            print(head);
        }

    }


}

