// Java Program to Find HCF of Two Numbers

import java.util.Scanner;

public class HCFOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = num1 > num2 ? num1 : num2;
		while(true) {
			if(res%num1 == 0 && res%num2 == 0) {
				break;
			}
			res++;
		}
		System.out.println((num1*num2) / res);
	}
}
