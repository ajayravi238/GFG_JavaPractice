// Split a String into a Number of Substrings in Java

import java.util.ArrayList;
import java.util.Scanner;

public class SplitStringIntoNoOfSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i; j<str.length(); j++) {
				arr.add(str.substring(i, j+1));
			}
		}
		System.out.println(arr);
	}

}
