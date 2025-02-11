// Check if a given string is Pangram in Java

package gfgJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";
		s = str.toLowerCase();
		int[] arr = new int[26];

		for(int i=0; i<s.length(); i++) {
			int ascii = (int) s.charAt(i);
			arr[ascii-97]++;
		}
		int count = 0;
		for(int i=0; i<26; i++) {
			if(arr[i] >= 1) {
				count++;
			}
		}
		if(count == 26) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
