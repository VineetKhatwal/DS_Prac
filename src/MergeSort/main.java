package MergeSort;

import MergeList.LinkedListPrograms;

public class main {

	public static void main(String[] args) {
		

		mergeSort ms = new mergeSort();
		ms.insert(ms, 45);
		ms.insert(ms, 5);
		ms.insert(ms, 35);
		ms.insert(ms, 2);
		ms.insert(ms, 15);
		ms.insert(ms, 4);
		ms.insert(ms, 25);
		ms.insert(ms, 30);
		ms.insert(ms, 20);
		ms.print(ms);
		
	
		ms.head = ms.merge_sort(ms.head);
		ms.print(ms);
		
		ms.insertNode(ms,22);
		ms.print(ms);
		ms.insertNode(ms,0);
		ms.print(ms);
		
		ms.insertNode(ms,50);
		ms.print(ms);
		
		ms.insertNode(ms,13);
		ms.print(ms);
		
		//System.out.println("Length = " +ms.length(ms));

	}

}
