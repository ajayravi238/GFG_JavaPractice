// Java Program to Check Whether the Character is Vowel or Consonant

import java.util.Scanner;

public class CharacterIsVowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		char ch = Character.toLowerCase(c);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(c + " is a vowel");
		}
		else {
			System.out.println(c + " is not a vowel");
		}
	}

}
