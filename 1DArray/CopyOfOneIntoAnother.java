// Array Copy in Java

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfOneIntoAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		arr2 = arr1;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
