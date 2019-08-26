package MergeTwoList;

public class main {
	
	public static void main(String args[]) 
	{
		MergeLists llist1 = new MergeLists(); 
	    MergeLists llist2 = new MergeLists(); 
	    Node sortedList1;
	    // Node head1 = new Node(5); 
	    llist1.insert(llist1, 5); 
	    llist1.insert(llist1,10); 
	    llist1.insert(llist1, 15); 
	      
	    // Node head2 = new Node(2); 
	    llist2.insert(llist2, 2); 
	    llist2.insert(llist2, 3); 
	    llist2.insert(llist2, 18); 
	      
	      
	    sortedList1 = llist1.sortedMerge(llist1.head, llist2.head);
	    llist1.print(sortedList1);

	}
	    
      

}
