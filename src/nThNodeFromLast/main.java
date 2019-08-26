package nThNodeFromLast;

public class main {

	public static void main(String[] args) {
		

		printNthFromLast s = new printNthFromLast();
		s.insert(s, 0);
		s.insert(s, 1);
		s.insert(s, 2);
		s.insert(s, 3);
		s.insert(s, 4);
		s.insert(s, 5);
		s.insert(s, 6);
		s.insert(s, 7);
		s.insert(s, 8);
		s.insert(s, 9);
		
		s.nthNode(s.head, 3);

	}

}
