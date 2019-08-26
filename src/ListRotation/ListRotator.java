package ListRotation;


public class ListRotator {
	
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
	
	public void print(ListRotator list)
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
	
	public void insert(ListRotator list, int data) 
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
	
	public int length(ListRotator ll)
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
	
	// ************** ROTATOR ************** 
	
	public void rotator(ListRotator ll, int num, String direction)
	{
		if (direction == "left")
		{
			reverseList(ll);
		}
		
		if (num==0)
		{
			return;
		}
		
		Node curr = ll.head;
		int count = 1;
		
		// Curr points to kth element after this loop
		while (count < num && curr !=  null) 
        { 
			 
			System.out.println("C = " +curr.data);
			curr = curr.next;
            count++; 
        } 
		System.out.println(curr.data);
		
		if (curr == null) 
		{
			return;
		}
		
		Node k = curr;
		//System.out.println(k.data);
		
		
		while (curr.next != null)
		{
			curr = curr.next;
			System.out.println("C2 = " +curr.data);
		}
		//System.out.println(curr.data);
		System.out.println("H = " +head.data);
		
		curr.next = head;
		head = k.next;
		k.next = null;
		
		if (direction == "left")
		{
			reverseList(ll);
		}
	             
	}
	
	// **************Reverse************** 
	
	public static void reverseList(ListRotator list)
	{
		Node curr = list.head;	
		Node prev = null;
		Node next = null;
		while (curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		list.head = prev;
	}

}


