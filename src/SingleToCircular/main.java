package SingleToCircular;

public class main {

	public static void main(String[] args) {
		
		SinToCirc ll = new SinToCirc();
		ll.insert(ll, 1);
		ll.insert(ll, 2);
		ll.insert(ll, 3);
		ll.insert(ll, 4);
		ll.insert(ll, 5);
		ll.print(ll);
		ll.singToCirc(ll);
		ll.printCirc(ll);
	}
}
