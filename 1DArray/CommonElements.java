// Java Program to Find Common Elements Between Two Arrays

import java.util.*;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		String[] arr1 = new String[size1];
		for(int i=0; i<size1; i++) {
			arr1[i] = sc.next();
		}
		int size2 = sc.nextInt();
		String[] arr2 = new String[size2];
		for(int i=0; i<size2; i++) {
			arr2[i] = sc.next();
		}
		ArrayList<String> l = new ArrayList<String>();
		for(int i=0; i<size1; i++) {
			for(int j=0; j<size2; j++) {
				if(arr1[i].equals(arr2[j])) {
					l.add(arr1[i]);
				}
			}
		}
		System.out.println(l);
	}

}
