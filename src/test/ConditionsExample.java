package test;

import java.util.Scanner;

public class ConditionsExample {
	public static void main (String args[]) {
		int age;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age:");
		age=scanner.nextInt();
		if(age>18){
			System.out.println("you are eligible");
			
		}
		else if(age==18) {
			System.out.println("Please wait till next your for your turn");
		}
		else {
			System.out.println("Not eligible");
		}
		scanner.close();
	}

}
