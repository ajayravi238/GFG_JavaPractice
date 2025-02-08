// Java Program to Get a Character from a String

import java.util.Scanner;

public class GetACharacterFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = sc.nextInt();
		
		System.out.println(str.charAt(index));
	}
}
