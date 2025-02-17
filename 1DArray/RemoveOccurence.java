// Remove all occurrences of an element from Array in Java

import java.util.*;

public class RemoveOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<size; i++) {
			if(arr[i] != key) {
				l.add(arr[i]);
			}
		}
		System.out.println(l);
	}

}
