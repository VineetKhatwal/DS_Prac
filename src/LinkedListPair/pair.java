package LinkedListPair;



public class pair {
	
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
	
	// ************** PAIR *************
	
	public Node linkedListPair(Node head)
	{
		Node temp;
		
		if (head == null || head.next == null)
		{
			return head;
		}
		else
		{
			temp = head.next;
			head.next = temp.next;
			temp.next = head;
			head = temp;
			
			head.next.next = linkedListPair(head.next.next);
			return head; 
		}
	}
	// ************** INSERTION AT END************** 
	
		public static void insert(pair list, int data) 
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
		
		public static void print(pair list)
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
