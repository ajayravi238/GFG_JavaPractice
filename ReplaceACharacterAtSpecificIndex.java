// Replace a character at a specific index in a String in Java

import java.util.Scanner;

public class ReplaceACharacterAtSpecificIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = sc.nextInt();
		char ch = sc.next().charAt(0);
		char r = str.charAt(index);
		
		str = str.substring(0, index) + ch + str.substring(index+1);
		System.out.println(str);
	}

}
