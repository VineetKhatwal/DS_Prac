package MergeSort;


public class mergeSort {

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
	
	// ************* MERGE SORT ************

	public Node merge_sort(Node head)
	{
		if (head == null || head.next == null) 
		{ 
            return head; 
        } 
		
		Node mid = getMiddle(head); 
		Node nextOfMid = mid.next; 
		//System.out.println(node.data + " " + mid.data + " " + nextOfMid.data);
		
		mid.next = null;
		
		Node left = merge_sort(head); 
		Node right = merge_sort(nextOfMid);
		
		Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
	}
	
	// ************* MERGE SORT ************
	
	public Node sortedMerge(Node first, Node second)
	{
		Node result = null; 
        
		if (first == null)
		{
			return second;
		}
		
		if (second == null)
		{
			return first;
		}
		
		if (first.data <= second.data) 
		{ 
            result = first; 
            result.next = sortedMerge(first.next, second); 
        } 
        else 
        { 
            result = second; 
            result.next = sortedMerge(first, second.next); 
        } 
		
        return result; 
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
	
	public void print(mergeSort list)
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
	
	public void insert(mergeSort list, int data) 
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

	// ************** INSERTION IN SORTED LIST ************** 
	
	public void insertNode(mergeSort list, int data) 
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
	      	Node prev = null;
	      	if (curr.data >= data)
	      	{
	      		newNode.next = curr;
		      	head = newNode;
	      		return;
	      	}
	      	else
	      	{
	      		while (curr.next != null) 
		      	{ 
		      		prev = curr;
		      		curr = curr.next;
		      		if (curr.data >= data)
		      		{
		      			prev.next = newNode;
		    	        newNode.next = curr;
		      			break;
		      		}
		      	} 
	      		
	      		if (curr.next == null)
	      		{
	      			curr.next = newNode;
	      		}
	      	}
	 	}
	 }
	
	
	// **************LENGTH************** 
	
	public static int length(mergeSort ll)
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
