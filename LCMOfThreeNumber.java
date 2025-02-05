// Java Program to Find LCM of Two Numbers

import java.util.Scanner;

public class LCMOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int res = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
		while(true) {
			if(res%num1 == 0 && res%num2 == 0 && res%num3 == 0) {
				break;
			}
			res++;
		}
		System.out.println(res);
	}
}
