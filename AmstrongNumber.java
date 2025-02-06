// Java Program to Check Armstrong Number between Two Integers

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			int temp = i;
			String n = String.valueOf(i);
			int len = n.length();
			int sum = 0;
			while (temp > 0) {
				int rem = temp % 10;
				sum += Math.pow(rem, len);
				temp = temp / 10;
			}
			if(sum == i) {
				System.out.println(i);
			}
		}
	}

}
