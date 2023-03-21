package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print 1 to 10 using for loop

		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("End of for loop");

		// Print 10 to 1 (reverse) using for loop

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("End of for loop");
		
		// Print even numbers between 1 to 10
		
		for (int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}
		System.out.println("End of for loop");
		
		// Print table of 4
		
		int num = 4;
		for (int i = 1; i < 11; i++) {
			System.out.println(num + "*" + i + "=" + num * i); // format will be  num*i=num*1 like (2*1=2)
		}
		System.out.println("End of for loop");

	}

}
