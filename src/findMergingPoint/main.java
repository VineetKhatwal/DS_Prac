package findMergingPoint;

public class main {

	public static void main(String[] args) {
		
		mergePoint list = new mergePoint(); 
		  
		// creating first linked list 
		list.head1 = new Node(3); 
		list.head1.next = new Node(6); 
		list.head1.next.next = new Node(18); 
		list.head1.next.next.next = new Node(15); 
	  	list.head1.next.next.next.next = new Node(30); 
	  
	  	// creating second linked list 
	  	list.head2 = new Node(25); 
	  	list.head2.next = new Node(10); 
        list.head2.next.next = new Node(15); 
        list.head2.next.next.next = new Node(30); 
	  	
	  	//list.getNode(list.head1, list.head2);
	  	
	  	System.out.println("Intersection Point = " + list.getNode(list.head2, list.head1));

	}

}
