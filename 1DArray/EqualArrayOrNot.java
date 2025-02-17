// Java Program to Check if two Arrays are Equal or not

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrayOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count++;
			}
		}
		if (count == size) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
