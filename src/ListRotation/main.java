package ListRotation;

public class main {

	public static void main(String[] args) {
		
		ListRotator ll = new ListRotator(); 
        ll.insert(ll, 1); 
        ll.insert(ll, 2);
        ll.insert(ll, 3);
        ll.insert(ll, 4);
        ll.insert(ll, 5); 
        /*ll.insert(ll, 6);
        ll.insert(ll, 7);
        ll.insert(ll, 8);
        ll.insert(ll, 9);*/
     
        ll.print(ll); 
        ll.rotator(ll, 3, "right");
        ll.print(ll);
        ll.rotator(ll, 3, "right");
        ll.print(ll);
        

	}

}
