package com.geeksforgeeks.linkedlist;


public class LinkedList {
	
	Node head;
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	public void print(){
		Node node = head; 
		while (node != null) {
			System.out.println( "Node data " +node.data );
			node = node.next;
		}
	}
	
	public void deleteNode(int position) {
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = head.next;
		}
		
		Node next = temp.next.next;
		temp.next = next;
	}
	
	public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(4);
        llist.print();
        llist.deleteNode(2);
        System.out.println("*********");
        llist.print();
    }

}
