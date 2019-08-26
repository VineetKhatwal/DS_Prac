package ReversingLinkedList;

public class Reverse {
	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	// **************Reverse************** 
	
	public static void reverseList(Reverse list)
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
	    
	// ************** INSERTION AT END************** 
	
	public static void insert(Reverse list, int data) 
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
	

	// **************TRAVERSAL************** 
	
	public static void print(Reverse list)
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
	
	// **************LENGTH************** 
	
	public static int length(Reverse ll)
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

}
