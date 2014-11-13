package com.DSA.LinkedList;

public class LoopInLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node h = head;
		h.next= new Node(2);
		h=h.next;
		h.next= new Node(3);
		h=h.next;
		h.next= new Node(4);
		h=h.next;
		h.next= new Node(5);
		h=h.next;
		h.next= new Node(6);
		Node l =h;		//Loop is at Node 6
		h=h.next;
		h.next= new Node(7);
		h=h.next;
		h.next= new Node(8);
		h=h.next;
		h.next = l;  // loop is at Node 6
		
		
		Node p1 = head;
		Node p2 = head;
		Node s = head;
		
	
		// p2 is traversed twice as fast as p1 and the traversal is stopped 
		//when p1 and p2 meets (references the same node)
		int c=0;
		for(Node t=head;t!=null;t=t.next)
		{	
			System.out.println("p1 data "+p1.data+"  p2 data "+p2.data);
			p1=p1.next;
			p2=p2.next.next;
			++c;

			if(p1==p2)
			{
				break;
			}
		}
		
		
		// a node from head is traversed along with the node at which p1 and p2
		// met and they are traversed at same speed till they meet at a node
		Node loop = head; 
		while(loop!=p1)
		{
			loop = loop.next;
		}
		
		System.out.println("The loop is at: "+loop.data);
		
		
		

	}

}
