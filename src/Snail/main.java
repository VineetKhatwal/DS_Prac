package Snail;


public class main {

	public static void main(String[] args) {
		
		Snail s = new Snail();
		s.insert(s, 45);
		s.insert(s, 5);
		s.insert(s, 35);
		s.insert(s, 0);
		s.insert(s, 15);
		
		//System.out.println(s.head.next.data + " " + s.head.next.next.next.next.data + " " + s.head.next.next.data);
		s.head.next.next.next.next.next = s.head.next.next; 
		//s.print(s);
		s.detectAndRemoveLoop(s.head);
		s.print(s);
		s.singToCirc(s);
		s.printCirc(s);

	}

}
