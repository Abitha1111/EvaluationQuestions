package Zsgs;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		String alphastring = sc.nextLine();
		StringBuilder string = new StringBuilder();
		for (char c : alphastring.toCharArray()) {
			if (Character.isLetter(c)) {
				string.append(c);
			}
		}
		String reverse = string.toString().toUpperCase();
		char[] arr = reverse.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("Output :  ");
		for (char reversechar : arr) {
			System.out.print(reversechar + " ");
		}
	}
}
