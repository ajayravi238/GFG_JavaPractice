// Java Program to Find Sum of Fibonacci Series Numbers of First N Numbers

import java.util.Scanner;

public class SumOfFibonacciSeriesUptoN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int first = 0, second = 1;
		int fib = 0, sum = 1;
		for(int i=2; i<num; i++) {
			fib = first + second;
			sum += fib;
			first = second;
			second = fib;
		}
		System.out.println();
		System.out.print(sum);
	}

}
