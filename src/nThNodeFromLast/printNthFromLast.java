package nThNodeFromLast;


public class printNthFromLast {
	
	Node head;
	public int i = 0;

	// ************** INSERTION AT END************** 
	
	public void insert(printNthFromLast list, int data) 
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
	
	// ************** Nth Node from LAST **************
	
	public void nthNode(Node head, int n) 
	{ 
	    if (head == null)
	    {
	    	return;
	    } 
	    
	    nthNode(head.next, n); 
	    i++;
	    //System.out.println(i);
	    if (i == n) 
	    {
	    	System.out.println(head.data);
	    	return;
	    }    
	} 
	

}
