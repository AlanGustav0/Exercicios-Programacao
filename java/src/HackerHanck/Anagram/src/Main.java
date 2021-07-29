package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Anagram anagrama = new Anagram();
		Scanner sc = new Scanner(System.in);
		String a, b;

		// String a = "abcde";
		// String b = "xyzwf";
		// String c = "anagram";
		// String d = "margana";

			System.out.print("Insira a primeira frase: ");
			a = sc.nextLine();

			System.out.print("Insira a segunda frase: ");
			b = sc.nextLine();
			anagrama.Anagrama(a, b);
		

	}

}
