package CircularLinkedList;

public class main {

	public static void main(String[] args) {
		
		CircLinkedList cll = new CircLinkedList();
	
		cll.insertAtFront(cll, 5);
		cll.insertAtFront(cll, 6);
		cll.insertAtFront(cll, 7);
		cll.insertAtFront(cll, 8);
		cll.insertAtEnd(cll, 9);
		cll.insertAtEnd(cll, 10);
		cll.insertAtEnd(cll, 11);
		cll.print(cll);
		cll.deleteElement(cll,9);
		cll.print(cll);
		cll.deleteElement(cll,8);
		cll.print(cll);
		cll.deleteElement(cll,11);
		cll.print(cll);
		cll.deleteElement(cll,22);
		cll.print(cll);
		cll.deleteElement(cll,25);
		cll.print(cll);
		cll.deleteAtStart(cll);
		cll.print(cll);
		cll.insertAtFront(cll, 1);
		cll.insertAtEnd(cll, 2);
		cll.print(cll);
		cll.deleteElement(cll,1);
		cll.deleteElement(cll,5);
		cll.print(cll);
		cll.insertAtEnd(cll, 22);
		cll.insertAtFront(cll, 12);
		cll.print(cll);
		cll.deleteAtEnd(cll);
		cll.print(cll);
		cll.deleteElement(cll,55);
		cll.print(cll);
		cll.deleteElement(cll,12);
		cll.print(cll);
		cll.deleteElement(cll,22);
		cll.print(cll);
		cll.insertAtEnd(cll, 5);
		cll.print(cll);
		cll.insertAtEnd(cll, 15);
		cll.print(cll);
		cll.insertAtFront(cll, 25);
		cll.print(cll);
		cll.deleteAtEnd(cll);
		cll.print(cll);
		cll.insertAtEnd(cll, 35);
		cll.print(cll);
		cll.insertAtFront(cll, 27);
		cll.print(cll);
		cll.deleteAtEnd(cll);
		cll.print(cll);
		cll.deleteElement(cll, 5);
		cll.print(cll);
		cll.insertAtEnd(cll, 5);
		cll.print(cll);
		cll.insertAtPos(cll,4,0);
		cll.print(cll);
		cll.insertAtPos(cll,9, 3);
		cll.print(cll);
		cll.insertAtEnd(cll, 7);
		cll.print(cll);
		cll.insertAtPos(cll,11, 8);
		cll.print(cll);
		cll.insertAtPos(cll,19, 10);
		cll.print(cll);
		cll.insertAtPos(cll,19, 9);
		cll.print(cll);
		cll.deleteAtEnd(cll);
		cll.print(cll);
		cll.deleteElement(cll, 19);
		cll.print(cll);
		cll.deleteElement(cll, 22);
		cll.print(cll);
		cll.insertAtEnd(cll, 45);
		cll.print(cll);
		cll.insertAtPos(cll, 8,9);
		cll.print(cll);
		cll.insertAtPos(cll, 3,9);
		cll.print(cll);
	}

}
