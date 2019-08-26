package ReversingLinkedList;

public class main {

public static void main(String[] args) {
		
		Reverse s = new Reverse();
		s.insert(s, 45);
		s.insert(s, 5);
		s.insert(s, 35);
		s.insert(s, 0);
		s.insert(s, 15);
	
		s.print(s);
		s.reverseList(s);
		s.print(s);
	}
		
}
