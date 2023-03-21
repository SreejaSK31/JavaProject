package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Sreeja");
		list1.add("Ammu");
		list1.add("Appu");
		list1.add("Aami");
		System.out.println("the list is " + list1 + " and the list size is " + list1.size()+"\n");
		System.out.println("the last element is" + list1.get(list1.size() - 1)+"\n");

		list1.add(1, "Kichu");//add a new element at index position 1
		System.out.println(list1+"\n");

		list1.set(0, "paru"); //update the element at index position 0
		System.out.println(list1+"\n");

		list1.remove(1);//remove the element at index position 1
		System.out.println( list1+"\n");

		Iterator<String> it = list1.iterator();
		System.out.println("The list using iterator is ");
		while (it.hasNext()) {
			System.out.println(it.next()+"\n");
		}
		
		Collections.sort(list1);
		System.out.println("Sorted list in ascending order " + list1+"\n");

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After Sorting in descending order is " + list1+"\n");
	}
}
