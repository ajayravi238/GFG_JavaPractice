// Java Program to Left Rotate the Elements of an Array

import java.util.*;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int rotate = sc.nextInt();
		for(int i=rotate; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i=0; i<rotate; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
