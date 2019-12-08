package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		printCustomMessage((s) -> {
			String n = "";
			for (int i = 7; i >= 0; i--) {
				n += s.charAt(i);

			}
			System.out.println(n);
		}, "backward");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper and lower case characters.
		printCustomMessage((s) -> {
			String n = "";
			Random coin = new Random();
			for (int j = 0; j < s.length() - 1; j++) {
				if (coin.nextInt(2) == 1) {
					n += Character.toUpperCase(s.charAt(j));
				} else {
					n += Character.toLowerCase(s.charAt(j));
				}

			}
			System.out.println(n);
		}, "ttttteeeessssssstttttttt");
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		printCustomMessage((s) -> {
			String test = "";
			for (int i = 0; i < 6; i++) {
				test += s.substring(i, i + 1) + ".";

			}
			System.out.println(test);
		}, "period");
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		printCustomMessage((s) -> {
			String b = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					
				}else {
					b += s.charAt(i);
				}
				
			}
			System.out.println(b);
		}, "value");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
