package MergeList;


public class LinkedListPrograms {

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
	
	public void print(LinkedListPrograms list)
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
	
	public void insert(LinkedListPrograms list, int data) 
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
	
	// ************** MERGING AT ALTERNATE POSITION ************** 
	
	public void merge(LinkedListPrograms list1, LinkedListPrograms list2, LinkedListPrograms list3)
	{
		Node curr1 = list1.head;
		Node curr2 = list2.head; 
        Node curr1_next, curr2_next; 
        Node curr = null;
        

        while (curr1 != null && curr2 != null) { 
            //curr1_next = curr1; 
            //curr2_next = curr2; 
           
            insert(list3, curr1.data);
            insert(list3, curr2.data);
            
            curr1=curr1.next;
            curr2=curr2.next;
            
        } 
	}
	
	// **************** Merging two linked list with the largest element from the list ********
	
	public static void newList(LinkedListPrograms l1, LinkedListPrograms l2, LinkedListPrograms l3)
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
	
	// ************** INSERTION AT START************** 
	
	public void insertBeginning(LinkedListPrograms list, int data)
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
}
