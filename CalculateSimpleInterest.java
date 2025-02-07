// Java Program to Calculate Simple Interest

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		
		int res = (P*N*R)/100;
		System.out.println(res);
	}

}
