
public class main {

	public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList ll = new LinkedList(); 

        ll.insert(ll, 1); 
        ll.insert(ll, 2);
        ll.insert(ll, 3);
        ll.insert(ll, 4);
        ll.insert(ll, 5); 
        ll.insert(ll, 6);
        ll.insert(ll, 7);
        ll.insert(ll, 8);
        ll.insert(ll, 9);
     
        ll.print(ll); 
        
        ll.delete(ll, 18);
        ll.print(ll);
        ll.delete(ll, 9);
        ll.print(ll);
        ll.deleteAtPosition(ll, 0);
        ll.print(ll);
        ll.deleteAtPosition(ll, 3);
        ll.print(ll);
        ll.deleteAtPosition(ll, 5);
        ll.print(ll);
        ll.deleteAtPosition(ll, 9);
        ll.print(ll);
        ll.insertAtPosition(ll, 12,0);
        ll.print(ll);
        ll.insertAtPosition(ll, 13,4);
        ll.print(ll);
        ll.insertAtPosition(ll, 15,7);
        ll.print(ll);
        ll.insertAtPosition(ll, 15,6);
        ll.print(ll);
        ll.insertAtPosition(ll, 23,14);
        System.out.println("-------");
        ll.print(ll);
        System.out.println("-------");
        ll.deleteAtPosition(ll, 0);
        ll.print(ll);
        ll.deleteAtPosition(ll, 8);
        ll.print(ll);
        System.out.println("Length = " + ll.length(ll));
        ll.deleteAtPosition(ll, 6);
        ll.print(ll);
        ll.deleteAtPosition(ll, 6);
        ll.print(ll);
        ll.deleteAtPosition(ll, 6);
        ll.print(ll);
        System.out.println("---------------------------");
        
        LinkedList l1 = new LinkedList(); 
        l1.insert(l1, 1); 
        l1.insert(l1, 5);
        l1.insert(l1, 6);
        l1.insert(l1, 9);
        
        LinkedList l2 = new LinkedList(); 
        l2.insert(l2, 2); 
        l2.insert(l2, 4);
        l2.insert(l2, 5);
        l2.insert(l2, 10);
        
        
        LinkedList l3 = new LinkedList();
        l3.newList(l1,l2, l3);
        l3.print(l3);
        System.out.println("Length = " + l3.length(l3));
        
        l3.insertAtPosition(l3, 23,4);
        System.out.println("-------");
        l3.print(l3);
        
        l3.insertAtPosition(l3, 23,3);
        System.out.println("-------");
        l3.print(l3);
        
        l3.insertBeginning(l3,0);
        System.out.println("-------");
        l3.print(l3);
        
        System.out.println("Length = " + l3.length(ll));
    }


}
