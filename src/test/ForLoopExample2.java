package test;

public class ForLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for lop for array
		int i;
		int arr[]= {2,3,8,9,5,4};
		for(i=0;i<arr.length;i++) {
			System.out.println("Array value is"+arr[i]);
		}
		System.out.println();
		
//		simple for each loop - print all element in the array without looking for any condition
		for(int val:arr) {
			System.out.println("Value is "+val);
			
	}
		System.out.println();
String str="Sreeja";
for(i=0;i<str.length();i++) {
	System.out.println(str.charAt(i));
}
	}

}
