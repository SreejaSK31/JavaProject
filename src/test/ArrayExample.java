package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		String strarr[]= {"Sreeja","kurup","Ammu","Appu"};
				System.out.println("Lengthof the array is "+arr.length);
		System.out.println("First element of the array is "+arr[0]);
		System.out.println("last element of the array is "+arr[arr.length-1]);
		System.out.println("last element of the String array is "+strarr[strarr.length-1]);
		String str="Read this - clean World green world";
		String strwords[]=str.split(" ");
		System.out.println("Total words in string array are "+strwords.length);
		

	}

}

