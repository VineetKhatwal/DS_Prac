package splitCircularList;

import nThNodeFromLast.printNthFromLast;

public class main {

	public static void main(String[] args) {
		

		split s = new split();
		s.insertAtEnd(s, 11);
		s.insertAtEnd(s, 2);
		s.insertAtEnd(s, 56);
		s.insertAtEnd(s, 12);
		//s.insertAtEnd(s, 4);

		
		s.print(s.head);
		s.splitList();

	}

}
