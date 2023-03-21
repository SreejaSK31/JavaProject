package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> Hset = new HashSet<String>();
		Hset.add("Sreeja");
		Hset.add("Ammu");
		Hset.add("Appu");
		Hset.add("Aami");
		Hset.add("Aami");
		//Hset.add(null);
		System.out.println(Hset+"\n");
		
		TreeSet<String> Tset = new TreeSet<String>();
		Tset.add("Niranjana");
		Tset.add("Sree");
		Tset.add("Pappu");
		Tset.add("Pappu");
		System.out.println(Tset+"\n");
		
		ArrayList<String> Alist = new ArrayList<String>(Hset);
		System.out.println(Alist+"\n");
		Collections.sort(Alist);
		System.out.println("Sorted list in ascending order " + Alist+"\n");
		

		
		
	}
	

}
