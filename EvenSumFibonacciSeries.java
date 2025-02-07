// Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes

import java.util.Arrays;
import java.util.Scanner;

public class EvenSumFibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[(num*2)+1];
		int first = 0, second = 1;
		arr[0] = first;
		arr[1] = second;
		int fib = 0, y = 2;
		for(int i=2; i<(num*2)+1; i++) {
			fib = first + second;
			arr[y++] = fib;
			first = second;
			second = fib;
		}
		int sum = 0;
		for(int i=0; i<(num*2)+1; i=i+2) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
