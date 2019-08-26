package ModularNodeFromEnd;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ModularNode {
	
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
	
	
	// ************** INSERTION AT END************** 
	
	public void insert(ModularNode list, int data) 
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
	
	public int length(ModularNode ll)
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
	
	// **************Modular Node************** 
	
	public void modulus(ModularNode ll, int num)
	{
		
		int elem = length(ll);
		System.out.println("Elem1 = " + elem);
		while (elem %num != 0)
		{
			System.out.println("Ele = " + elem);
			elem --;
		}
		System.out.println("Elem 2= " + elem);
	    print(ll, elem);

		
	}
	
	// **************TRAVERSAL************** 
	
	public void print(ModularNode list, int elem)
	{
		int counter=1;
		Node curr = list.head;	
		//System.out.print("LinkedList: "); 
		while (curr != null)
		{
			if (counter == elem)
			{
				System.out.print(curr.data + " ");
				System.out.println();
			}
			curr = curr.next;
			counter++;
		}
	}
	


}
