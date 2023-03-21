package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse the string
		int i;
		String str = "Sreeja";
		for (i = str.length() - 1; i >= 0; i--) {

			System.out.println(str.charAt(i));
		}
		// check string is palindrome or not

		String str1 = "madam";
		String result = "";
		for (i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);

			if (str1.equals(result)) {
				System.out.println("String is palindrome");
			}

		}
		// Reverse the entire sentence

		String str3 = "David meets John and lilly";
		String strarr[] = str3.split(" ");
		String result2 = "";

		for (i = strarr.length - 1; i >= 0; i--) {
			result2 = result2 + strarr[i]+" "; //giving " " is to add space after the words
					}
		System.out.println("result is - " + result2.trim()); //adding trim function to ignore the space added after the last word
	}
}
