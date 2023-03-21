package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int number = 13;
		boolean flag = true;
		for (i = 2; i <= number / 2; i++) {

			int rem = number % i;

			if (rem == 0) {

				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not prime");
		}
	}

}
