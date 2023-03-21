package test;

public class NumbersExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int sum = addition(a,b);
		int sum1 = subtraction(a,b);
		System.out.println("Sum is " +sum);
		System.out.println("Difference is " +sum1);
	}
	public static int addition (int a, int b) {
		return a+b;
		
	}
	public static int subtraction (int a, int b) {
		return b-a;
	}

}
