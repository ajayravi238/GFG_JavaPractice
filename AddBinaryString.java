// Java Program to Add Two Binary Strings

import java.util.Scanner;

public class AddBinaryString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int a = Integer.parseInt(s1, 2);
		int b = Integer.parseInt(s2, 2);
		String res = Integer.toBinaryString(a+b);
		System.out.println(res);
	}

}
