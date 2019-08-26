package SingleToCircular;


public class SinToCirc 
{
	
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
	
	public void insert(SinToCirc list, int data) 
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

	
	// **************SINGULAR TO CIRCULAR ************
	
	public void singToCirc(SinToCirc list)
	{
		Node curr = list.head;		
		while (list.head.next != null)
		{
			list.head = list.head.next;
		}
		list.head.next = curr;
		list.head = list.head.next;
		// OR
		// list.head = curr;
	}
	
	// ****************** PRINT CIRCULAR ****************** 
	
	public void printCirc(SinToCirc list)
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
	
	// **************TRAVERSAL************** 
	
	public void print(SinToCirc list)
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
	
}
