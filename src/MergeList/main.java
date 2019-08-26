package MergeList;


public class main {

	public static void main(String[] args) {
		

		LinkedListPrograms ml1 = new LinkedListPrograms();
		ml1.insert(ml1, 1);
		ml1.insert(ml1, 3);
		ml1.insert(ml1, 5);
		ml1.insert(ml1, 17);
		ml1.insert(ml1, 9);
		//ml1.print(ml1);
		
		LinkedListPrograms ml2 = new LinkedListPrograms();
		ml2.insert(ml2, 2);
		ml2.insert(ml2, 4);
		ml2.insert(ml2, 6);
		ml2.insert(ml2, 8);
		//ml2.print(ml2);
		
		LinkedListPrograms ml3 = new LinkedListPrograms();
		//ml3.print(ml3);
		ml3.merge(ml1, ml2, ml3);
		System.out.println("Merged List");
		ml3.print(ml3);
		
		LinkedListPrograms ml4 = new LinkedListPrograms();
		ml4.newList(ml1, ml2, ml4);
		ml4.print(ml4);
		ml4.insertBeginning(ml4, 10);
		ml4.print(ml4);
		ml4.insert(ml4, 11);
		ml4.print(ml4);
	}

}
