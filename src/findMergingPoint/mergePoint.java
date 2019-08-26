package findMergingPoint;


public class mergePoint {
	
	Node head1, head2;
	public int getCount(Node head)
	{
		if (head == null)
		{
			return 0;
		}
		
		int count = 0;
		while(head != null)
		{
			head = head.next;
			count++;
		}
		return count;
	}
	
	/*function to get the intersection point of two linked lists head1 and head2 */
	
	public int getNode(Node head1, Node head2)
	{
		int c1 = getCount(head1);
		int c2 = getCount(head2);
			
		System.out.println(c1 + " " + c2);
		
		int d;
		
		if (c1 > c2)
		{
			d = c1-c2;
			return getIntesectionNode(d, head1, head2); 
		}
		else
		{
			d = c2-c1;
			return getIntesectionNode(d, head2, head1); 
		}
		
		//System.out.println("D = " + d);
		//return getIntesectionNode(d, head1, head2); 
	}
	
	public int getIntesectionNode(int d, Node head1, Node head2)
	{
		int i;
		
		Node current1 = head1; 
	    Node current2 = head2;
	     
	    for (i=0 ; i < d ; i++)
	    {
	    	if (current1 == null)
	    	{
	    		return -1;
	    	}
	    	current1 = current1.next;

	    }
	    
	    while (current1 != null && current2 != null) 
	    { 
            if (current1.data == current2.data) 
            { 
                return current1.data; 
            } 
            current1 = current1.next; 
            current2 = current2.next; 
        } 
	        
		return - 1;
	}
	
	
}
