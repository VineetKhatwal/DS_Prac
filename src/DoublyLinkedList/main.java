package DoublyLinkedList;

public class main {

	public static void main(String[] args) {
		
		doubleLinkedList dl = new doubleLinkedList();
		
		dl.insertAtFront(dl, 7);
		dl.insertAtFront(dl, 1);
		dl.insertAtFront(dl, 4);
		
		dl.insertAtEnd(dl, 9);
		dl.insertAtEnd(dl, 12);
		
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.insertAtPosition(dl, 6, 0);
		dl.insertAtPosition(dl, 2, 4);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.insertAtPosition(dl, 6, 7);
		dl.insertAtPosition(dl, 6, 6);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.insertAtPosition(dl, 7, 8);
		dl.insertAtEnd(dl, 7);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteAtPosition(dl, 0);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteAtPosition(dl, 5);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteAtPosition(dl, 7);
		dl.deleteAtPosition(dl, 6);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		
		dl.deleteData(dl, 3);
		dl.deleteData(dl, 4);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteData(dl, 9);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteData(dl, 12);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		
		dl.deleteData(dl,6);
		System.out.println("-------------------------------------------------");
		dl.printListForward(dl);
		System.out.println(); 
		dl.printListBackward(dl);
		System.out.println(); 
		System.out.println(dl.length(dl)); 
		
		
	}

}
