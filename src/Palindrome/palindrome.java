package Palindrome;


public class palindrome {
	
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
	
	// ************* PALINDROME************
	
	public void palindromeCheck(palindrome list)
	{
		Node curr = list.head;
		
		Node mid = getMiddle(curr);
		Node midNext = mid.next;
		mid.next = null;
		
		palindrome revList = new palindrome();
		reverseList(revList, midNext);
		
		//print(list);
		//print(revList);
		checkPal(revList, list);
	}
	
	// ************* CHECK************
	
	public void checkPal(palindrome list1, palindrome list2)
	{
		int counter = 0;
		Node curr1 = list1.head;
		Node curr2 = list2.head;
		while (curr1 != null )
		{
			if (curr1.data != curr2.data)
			{
				counter++;
				System.out.println("Not a plaindrome");
				break;
			}
				
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		

		if (counter ==0)
		{
			System.out.println("Plaindrome");
		}
		
		System.out.println(); 
	}
	
	// **************Reverse************** 
	
	public void reverseList(palindrome revList, Node mid)
	{
		Node curr = mid;	
		Node prev = null;
		Node next = null;
		while (curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		revList.head = prev;
	}
	
	// ************* GET MIDDLE ************
	
	Node getMiddle(Node head)
	{
		 if (head == null) 
		 {
			 return head; 
		 }
		 
		 Node fastptr = head.next; 
	     Node slowptr = head;
	     
	     while (fastptr != null) 
	     { 
	    	 fastptr = fastptr.next; 
	    	 
	    	 if (fastptr != null) 
	    	 { 
	    		 slowptr = slowptr.next; 
	    		 fastptr = fastptr.next; 
	    	 } 
	     } 
	     return slowptr; 
	            
	}
	
	// **************TRAVERSAL************** 
	
	public void print(palindrome list)
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
	
	public void insert(palindrome list, int data) 
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

}
