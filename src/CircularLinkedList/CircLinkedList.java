package CircularLinkedList;

public class CircLinkedList {
	
	Node head;
	Node tail;
	
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
	
	// ************** INSERTION AT FRONT ************** 
	
	public void insertAtFront(CircLinkedList cll, int data)
	{
		Node newNode = new Node(data);
		newNode.next = newNode;
		
		// If the list is empty
		
		if (cll.head == null)
		{
			cll.head = newNode;
			cll.tail = newNode;
            newNode.next = newNode;
		}
		else
		{
			newNode.next = cll.head;
			cll.head = newNode;
			cll.tail.next = cll.head;
		}
		
	}
	
	
	// ************** INSERTION AT END************** 
	
	public void insertAtEnd(CircLinkedList cll, int data)
	{
		Node newNode = new Node(data);
		newNode.next = newNode;
		
		// If the list is empty
		
		if (cll.head == null)
		{
			cll.head = newNode;
			cll.tail = newNode;
            newNode.next = newNode;
		}
		else
		{
			cll.tail.next =newNode;
			cll.tail=newNode;
			cll.tail.next = cll.head;
			//System.out.println(cll.head.data + " " + cll.tail.data);
		}
	}
	
	// ************** DELETION AT START ************** 
	
	 public void deleteAtStart(CircLinkedList cll)
	 {
		 Node curr = cll.head;
		 if (curr == null)
		 {
			 System.out.println("The list is empty");
		 }
		 else
		 {
			 cll.head = cll.head.next;
		 	 cll.tail.next = cll.head;
		 }
	 }
	 

	// ************** DELETION AT END ************** 
		
	public void deleteAtEnd(CircLinkedList cll)
	{
		Node curr = cll.head;
		Node prev = null;
		
		if (curr == null)
		{
			System.out.println("The list is empty");
			return;
		}

		do
		{
			prev = curr;
			curr = curr.next;
		}
		//while (prev.next.next != head);
		while (curr.next != head);
			
		tail = prev;
		tail.next = cll.head;
		curr = null;

	}
	 
	// ************** DELETING AN ELEMENT ************** 
		
	public void deleteElement(CircLinkedList cll, int data)
	{
		Node curr = cll.head;
		Node prev = null;
			 
		if (curr != null && curr.data == data)
		{
			deleteAtStart(cll);
			return;
		} 
		
		do
		{
			prev = curr;
			curr = curr.next;
			//System.out.println("Curr = " + prev.data + " " + curr.data + " " + head.data);
		}
		while (curr!=head && curr.data != data);
			 
		if (curr == head)
		{
			System.out.println(data + " not found"); 
			
		}
		else
		{ 
			if (curr.data == tail.data)  // or curr == tail
			{
				deleteAtEnd(cll);
				/*tail = prev;
				tail.next = cll.head;
				curr = null;*/
			}
			else
			{
				prev.next = curr.next;
				curr = null;
			}
		}
	}
	
	// ************** INSERTING AT POSITION ************** 
	
	public void insertAtPos(CircLinkedList cll, int data, int pos)
	{
		Node newNode = new Node(data);
		newNode.next = newNode;
		
		Node curr = cll.head;
		Node prev = null;
		
		// If the list is empty
		
		if (cll.head == null)
		{
			cll.head = newNode;
			cll.tail = newNode;
            newNode.next = newNode;
            return;
		}
		
		if (pos == 0)
		{
			insertAtFront(cll, data);
			return;
		}
		else
		{
			int counter = 0;
			
			do
			{
				if (counter == pos)
				{
					prev.next = newNode;
					newNode.next = curr;
					break;
				}
				else
				{
					prev = curr;
					curr = curr.next;
					counter ++;
				}
			}
			while (curr!=head);
		}
		
		if (curr == head)
		{
			System.out.println("Element position out of bound");
		}
	}
	
	// ****************** PRINT ****************** 
	
	public void print(CircLinkedList cll)
	{
		Node curr = cll.head;
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
