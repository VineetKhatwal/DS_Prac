package splitCircularList;

public class split {
	
		
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
		
		
		// ************** INSERTION AT END************** 
		
		public void insertAtEnd(split cll, int data)
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
		
		// ****************** PRINT ****************** 
		
		public void print(Node head)
		{
			Node curr = head;
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
		
		// ****************** SPLIT ****************** 
		
		public void splitList()
		{
			Node head1 = null;
			Node head2 = null;
			Node slow_ptr = head; 
	        Node fast_ptr = head; 
	  
	        if (head == null) { 
	            return; 
	        } 
	  
	        /* If there are odd nodes in the circular list then fast_ptr->next becomes head and for even nodes  
	         * fast_ptr->next->next becomes head */
	        System.out.println("H = " + fast_ptr.data + " " + slow_ptr.data);
	        
	        while (fast_ptr.next != head && fast_ptr.next.next != head) 
	        { 
	            fast_ptr = fast_ptr.next.next; 
	            slow_ptr = slow_ptr.next; 
	            System.out.println("F " + fast_ptr.data + " " + slow_ptr.data);
	        } 
	        
	        System.out.println(fast_ptr.data + " " + slow_ptr.data);
	  
	        /* If there are even elements in list then move fast_ptr */
	        if (fast_ptr.next.next == head) 
	        { 
	            fast_ptr = fast_ptr.next; 
	        } 
	        
	        System.out.println(fast_ptr.data + " " + slow_ptr.data);
	  	  
	        /* Set the head pointer of first half */
	        head1 = head; 
	        System.out.println("Head1 = " + head1.data );
	        System.out.println("Head = " + head.next.data + " " +head.data );
	  
	        /* Set the head pointer of second half */
	        if (head.next != head) { 
	            head2 = slow_ptr.next; 
	        } 
	        /* Make second half circular */
	        fast_ptr.next = slow_ptr.next; 
	  
	        /* Make first half circular */
	        slow_ptr.next = head; 
	        
	        print(head1);
	        
	        print(head2);
			
		}

}
