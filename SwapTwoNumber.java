// Java Program to Swap Two Numbers

import java.util.*;
public class SwapTwoNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
// 		int temp = a;
// 		a = b;
// 		b = temp;
// 		System.out.println(a + " " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a + " " + b);
	}
}
