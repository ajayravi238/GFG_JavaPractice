// Java Program for factorial of a number

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 1;
		for(int i=num; i>0; i--) {
			temp *= i;
		}
		System.out.println(temp);
	}

}
