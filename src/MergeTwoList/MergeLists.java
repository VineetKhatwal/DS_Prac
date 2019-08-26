package MergeTwoList;


public class MergeLists {
	
	Node head;
	
	public static void insert(MergeLists list, int data) 
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
	
	public static void print(Node curr)
	{
		System.out.print("LinkedList: "); 
		while (curr != null)
		{
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println(); 
	}

}
