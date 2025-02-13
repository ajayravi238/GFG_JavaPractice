// Java Program to Merge Two Arrays

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[size];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int k = 0;
		int[] mergeArr = new int[size*2];
		for(int i=0; i<arr1.length; i++) {
			mergeArr[k++] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			mergeArr[k++] = arr2[i];
		}
		System.out.println(Arrays.toString(mergeArr));
	}
}
