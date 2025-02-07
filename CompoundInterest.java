// Java Program for compound interest

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int N = sc.nextInt();
		double R = sc.nextDouble();
		double CI = P * (Math.pow(1 + (R/100), N));
		
		System.out.println(CI);
	}

}
