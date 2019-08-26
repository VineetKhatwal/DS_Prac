package DoublyLinkedList;


/*
Advantages over singly linked list
1) A DLL can be traversed in both forward and backward direction.
2) The delete operation in DLL is more efficient if pointer to the node to be deleted is given.
3) We can quickly insert a new node before a given node.

Disadvantages over singly linked list
1) Every node of DLL Require extra space for an previous pointer. It is possible to implement DLL with single pointer though (See this and this).
2) All operations require an extra pointer previous to be maintained. 
*/

public class doubleLinkedList {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public void insertAtFront(doubleLinkedList dll, int data)
	{
		Node newNode = new Node(data); 
		 
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head= newNode;
		}
		/*newNode.next = dll.head; 
		newNode.prev = null; 
	  
	   
	    if (dll.head != null) 
	    	dll.head.prev = newNode; 
	  
	    dll.head = newNode; */
	}
	
	public void insertAtEnd(doubleLinkedList dll, int data)
	{
		Node newNode = new Node(data); 
		newNode.next = null; 
		newNode.prev = null; 
	  
		if (dll.head == null) 
        { 
            dll.head = newNode; 
        } 
        else 
        { 
        	Node curr = dll.head; 
            while (curr.next != null) 
            { 
            	curr = curr.next; 
            } 
            newNode.prev = curr;
            curr.next = newNode; 
        }   
	}
	
	public void insertAtPosition(doubleLinkedList dll, int data, int pos)
	{
		Node newNode = new Node(data); 
		newNode.next = null; 
		newNode.prev = null; 
		
		Node curr = dll.head; 
    	Node prev = null;
	  
		if (dll.head == null) 
        { 
            dll.head = newNode; 
        } 
        
		if (pos == 0)
		{
			insertAtFront(dll,data);
		}
		else
		{
        	int counter = 0; 
        	
        	while (curr != null)
			{
				if (counter == pos)
				{
					prev.next = newNode;
	            	newNode.prev = prev;
	            	//System.out.println("2 = " +counter + " " + pos + " ");
	            	if (curr!=null)
	            	{
	            		curr.prev = newNode;
	            	}
	            	
					newNode.next = curr;
					break;
					
					
					
					/*System.out.println();
					System.out.println("P Data = " +prev.data);
	            	System.out.println("P Next = " +prev.next.data);
	            	
	            	System.out.println("D Prev = " +newNode.prev.data);
	            	System.out.println("D Data = " +newNode.data);
	            	System.out.println("D Next = " +newNode.next.data);
	            	
	            	System.out.println("C Prev = " +curr.prev.data);
	            	System.out.println("C Data = " +curr.data);
	            	System.out.println("C Next = " +curr.next.data);*/
					
				}
				else
				{
					prev = curr;
					curr = curr.next;
					counter++;
				}
			}
        	
            if (curr == null) 
			{ 
				System.out.println(data + " cannot be inserted at key " + pos);	
			}
            
        } 
	   
	}
	
	public void deleteAtPosition(doubleLinkedList dll, int pos)
	{
		Node curr = dll.head;
		Node prev = null;
		
		if (curr != null & pos == 0)
		{
			head = curr.next;
			head.prev = null;
			return;
		}
		
		int counter = 0;
		while (curr != null)
		{
			if (counter == pos)
			{
				//System.out.println("Temp = " + curr.data);
				if (curr.next != null)
				{
					curr.next.prev = curr.prev;
				}
				
	        	prev.next = curr.next;
	        	curr.prev = null;
	        	curr.next = null;
				break;
			}
			else
			{
				prev = curr;
				curr = curr.next;
				counter++;
			}
			//return;
		}
		
		// CASE 3	: The index is greater than the size of the LinkedList 
       
        if (curr == null) { 
            System.out.println(pos + " position element not found"); 
        } 
	
	}
	
	public void deleteData(doubleLinkedList dll, int data)
	{
		Node curr = dll.head;
		Node prev = null;
		
		if (curr != null & curr.data == data)
		{
			dll.head = curr.next;
			dll.head.prev = null;
			return;
		}
		
		while (curr != null && curr.data != data)
		{
			prev = curr;
			curr = curr.next;
		}
		
		if (curr != null)
		{
			if (curr.next != null)
			{
				curr.next.prev = curr.prev;
			}
			
        	prev.next = curr.next;
        	curr.prev = null;
        	curr.next = null;
			
		}
		
		// CASE 3:	The key is not present 
		if (curr == null) { 
            // Display the message 
            System.out.println(data + " not found"); 
        } 
	}
	
	void printListForward(doubleLinkedList dll)  
	{  
	   
	    Node curr = dll.head;	
	    
		System.out.print("LinkedList: Forward 	: "); 
		while (curr != null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
	} 
	
	void printListBackward(doubleLinkedList dll)  
	{  
	   
		Node curr = dll.head;
		Node last = null;
		while (curr.next != null)
		{
			curr = curr.next;
			last = curr;
		}
		
		//System.out.print(" D = " + last.data + " ");
		
		System.out.print("LinkedList: Reverse 	: "); 
		while (last != null)
		{
			System.out.print(last.data + " ");
			last = last.prev;
		}
	} 
	
	// **************LENGTH************** 
	
		public static int length(doubleLinkedList ll)
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
