// Check if a value is present in an Array in Java

import java.util.*;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int f = 0;
		for(int i=0; i<size; i++) {
			if(arr[i] == key) {
				System.out.println("True " + i);
				f = 1;
			}
		}
		if(f == 0) {
			System.out.println("False");
		}
	}

}
