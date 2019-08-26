

public class LinkedList {
	
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
	
	// ************** INSERTION AT START************** 
	
	public void insertBeginning(LinkedList list, int data)
	{
		
		Node newNode = new Node(data); 
	    newNode.next = null; 
	  
	    if (list.head == null) 
	    { 
	    	list.head = newNode; 
	   	} 
	 	else 
	 	{ 
	      	newNode.next = list.head;
	      	head = newNode;
	 	} 
	}
	// **************** Merging two linked list with the largest element from the list ********
	public static void newList(LinkedList l1, LinkedList l2, LinkedList l3)
	{
		
		Node curr1 = l1.head;	
		Node curr2 = l2.head;
		
		while (curr1 != null && curr2 != null)
		{
			
			if (curr1.data >= curr2.data)
			{
				l3.insert(l3, curr1.data);
			}
			else
			{
				l3.insert(l3, curr2.data);
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		System.out.println(); 
	}
	    
	// ************** INSERTION AT END************** 
	
	public static void insert(LinkedList list, int data) 
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
	
	// ************** INSERT AT A POSITION ************** 
	
	public static void insertAtPosition(LinkedList list, int data, int index) 
	{ 
		Node newNode = new Node(data); 
		newNode.next = null; 
		  
		if (list.head == null) 
		{ 
			list.head = newNode; 
		} 
		        
		Node curr = list.head;
		Node prev = null;	
		// CASE 1	:	Insertion at index 0
		if (curr != null && index == 0)
		{
			newNode.next = curr;
			list.head = newNode; 
			System.out.println(data + " inserted at key " + index);	
		}
				
				
		if (index != 0)
		{
		// CASE 2	:	Insertion at index > 0 
			
			int counter = 0;
			while (curr != null)
			{
				if (counter == index)
				{
					prev.next = newNode;
					newNode.next = curr;
					System.out.println(data + " inserted at key " + index);
					break;
				}
				else
				{
					prev = curr;
					curr = curr.next;
					counter++;
				}
			}
					
			/*int counter = 0;
			
			while (curr != null && counter != index)
			{
				prev = curr;
				curr = curr.next;
				counter++;
			}
			if (counter == index)
			{
				prev.next = newNode;
				newNode.next = curr;
				System.out.println(data + " inserted at key " + index);
			}		*/		
			// CASE 3	: The index is greater than the size of the LinkedList 
				       
			if (curr == null) 
			{ 
				System.out.println(data + " cannot be inserted at key " + index);	
			} 
		}
	}
	
	// **************TRAVERSAL************** 
	
	public static void print(LinkedList list)
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
	
	public static int length(LinkedList ll)
	{
		Node curr = ll.head;
		int counter = 0;
		while (curr != null)
		{
			++ counter ;
			curr = curr.next;
		}
		return counter;
	}
	
	
    // **************DELETION BY KEY************** 
	
	public static LinkedList delete (LinkedList list, int key)
	{
		Node curr = list.head;
		Node prev = null;
		
		// CASE 1:	If head holds the key
		
		if (curr != null && curr.data == key)
		{
			list.head = curr.next;
			System.out.println(key + " found and deleted");
			return list; 
		}
		
		
		// CASE 2: 	If the key is somewhere other than at head 
		while (curr != null && curr.data != key)
		{
			prev = curr;
			curr = curr.next;
		}
		if (curr != null)
		{
			prev.next = curr.next;
			System.out.println(key + " found and deleted"); 
		}
		
		// CASE 3:	The key is not present 
		if (curr == null) { 
            // Display the message 
            System.out.println(key + " not found"); 
        } 
		return list; 
	}
	
	// **************DELETION AT A POSITION************** 
	
	public static LinkedList deleteAtPosition (LinkedList list, int index)
	{
		Node curr = list.head;
		Node prev = null;
		// CASE 1	:	If index is 0 key
		if (curr != null && index == 0)
		{
			list.head = curr.next;
			System.out.println(index + " position element deleted");
			return list; 
		}
		
		// CASE 2	: If the index is greater than 0 but less than the size of LinkedList 
		
		int counter = 0;
		while (curr != null)
		{
			if (counter == index)
			{
				prev.next = curr.next;
				System.out.println(index + " position element deleted");
				break;
			}
			else
			{
				prev = curr;
				curr = curr.next;
				counter++;
			}
		}
		
		// CASE 3	: The index is greater than the size of the LinkedList 
       
        if (curr == null) { 
            System.out.println(index + " position element not found"); 
        } 
		return list;

	}

}
