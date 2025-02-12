// Remove Leading Zeros From String in Java

import java.util.Scanner;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = 0;
		while(i < str.length() && str.charAt(i) == '0') {
			i++;
		}
		System.out.println(str.substring(i));
	}

}
