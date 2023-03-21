package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> basket = new HashMap<String, Integer>();
		basket.put("Apple", 1);
		basket.put("Banana", 5);
		basket.put("Kiwi", 2);
		basket.put("Mango", 2);
		System.out.println("The map is " + basket);

		basket.remove("Kiwi");
		System.out.println("The map is " + basket);

		basket.put("Orange", 4);
		System.out.println("The map is " + basket);

		for (String item : basket.keySet()) {
			System.out.println("The item is " + item);
			System.out.println("The map is " + basket.get(item));

		}
		for (Integer val : basket.values()) {

			System.out.println("The value is " + val);
		}
		String str = "Hello World Clean World Green World";
		String[] arr = str.split("");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for (String word : arr) {
			if (!map1.keySet().contains(word)) {
				map1.put(word, 1);
			} else {
				map1.put(word, map1.get(word) + 1);
			}
		}
		
		System.out.println("The result is " + map1);
	}

}
