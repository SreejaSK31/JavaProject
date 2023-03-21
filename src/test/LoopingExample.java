package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("End of First while loop");
		System.out.println("");
		// This is for continue
		int num = 10;
		while (num > 0) {
			if (num == 5) {
				System.out.println("Skip and continue");
				num--;
				continue;
			}
			System.out.println(num);
			num--;

		}
		System.out.println("End of Second while loop for continue");
		System.out.println("");
		// This is for break
		int num2 = 10;
		while (num2 > 0) {
			if (num2 == 5) {
				System.out.println("Skip and Stop");
				num2--;
				break;
			}
			System.out.println(num2);
			num2--;

		}
		System.out.println("End of Third while loop for break");
		System.out.println("");

	}

}
