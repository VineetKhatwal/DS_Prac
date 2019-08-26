package LinkedListPair;


public class main {

	public static void main(String[] args) {
		
		pair s = new pair();
		s.insert(s, 45);
		s.insert(s, 5);
		s.insert(s, 35);
		s.insert(s, 0);
		s.insert(s, 15);
	
		s.print(s);
		s.head = s.linkedListPair(s.head);
		s.print(s);
	}

}
