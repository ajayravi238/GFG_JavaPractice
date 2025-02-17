// Array Copy in Java

package gfgJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfOneIntoAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		for(int i=0; i<size; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for(int i=0; i<size; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
