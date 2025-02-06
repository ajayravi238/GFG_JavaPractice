// Java Program to Check If a Number is Neon Number or Not

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String sq = String.valueOf(num*num);
		int sum = 0;
		for(int i=0; i<sq.length(); i++) {
			sum += Character.getNumericValue(sq.charAt(i));
		}
		if(num == sum) {
			System.out.println(num + " is neon number");
		}
		else {
			System.out.println(num + " is not neon number");
		}
	}

}
