// Remove duplicates from Sorted Array

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> s = new LinkedHashSet<>();
		for(int i=0; i<size; i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
		for(int i : s) {
			System.out.print(i + " ");
		}
	}

}
