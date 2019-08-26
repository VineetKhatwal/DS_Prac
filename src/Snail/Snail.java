package Snail;


public class Snail {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	// **************TRAVERSAL************** 
	
	public void print(Snail list)
	{
		Node curr = list.head;	
		System.out.print("LinkedList: "); 
		while (curr != null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println(); 
	}
	
	// ************** INSERTION AT END************** 
	
	public void insert(Snail list, int data) 
	{ 
		Node newNode = new Node(data); 
	    newNode.next = null; 
	  
	    if (list.head == null) 
	    { 
	    	list.head = newNode; 
	   	} 
	 	else 
	 	{ 
	      	Node curr = list.head; 
	      	while (curr.next != null) 
	      	{ 
	      		curr = curr.next; 
	      	} 
	 
	        curr.next = newNode; 
	 	}
	 }

	// **************LENGTH************** 
	
	public int length(Snail ll)
	{
		Node curr = ll.head;
		int counter = 1;
		while (curr.next != null)
		{
			++ counter ;
			curr = curr.next;
		}
		return counter;
	}
	
	
	// **************DETECTING SNAIL **************  
	
	public int detectAndRemoveLoop(Node curr)
	{
		Node slow = curr;
		Node fast = curr;
		
		while (slow != null && fast != null && fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
			//System.out.println(slow.data + " " + fast.data);
			if (slow == fast) 
			{ 
				System.out.println("Snail Detected ");
				System.out.println("D = " + slow.data + " " + fast.data);
                removeSnail(slow, curr); 
                return 1; 
            } 
		}
		return 0;
	}
	
	// **************REMOVING SNAIL **************  
	
	public void removeSnail(Node slow, Node curr)
	{
		Node ptr1 = null;
		Node ptr2 = null;
		
		ptr1 = curr;
		
		while (true)
		{
			ptr2 = slow;
			//System.out.println("PTR 2 = " + ptr2.data);
			
			while (ptr2.next != slow && ptr2.next != ptr1) { 
                ptr2 = ptr2.next; 
                System.out.println("PTR 2.1 = " + ptr2.data + " " + ptr1.data);
            } 
  
            if (ptr2.next == ptr1) { 
            	System.out.println("BREAK = "+ptr2.data + " " +ptr2.next.data);
                break; 
            } 
  
            ptr1 = ptr1.next; 
		}
		System.out.println("PTR NEXT = " + ptr2.data);
		ptr2.next = null; 
	}
	
	// **************SINGULAR TO CIRCULAR ************
	
	public void singToCirc(Snail list)
	{
		Node curr = list.head;		
		while (list.head.next != null)
		{
			list.head = list.head.next;
		}
		list.head.next = curr;
		list.head = list.head.next;
	}
	
	// ****************** PRINT CIRCULAR ****************** 
	
	public void printCirc(Snail list)
	{
		Node curr = list.head;
		//System.out.print("Head Data : " + curr.data + " "); 
		System.out.print("Circular LinkedList: "); 
		if (curr != null)
		{
			do
			{
				System.out.print(curr.data + " "); 
				curr = curr.next;
			}
			while (curr != head);
			
		}
		else
		{
			System.out.println("The list is empty");
		}
		System.out.println(); 
	}
	
}
