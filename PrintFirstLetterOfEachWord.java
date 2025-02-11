// Print first letter of each word in a string

import java.util.*;

public class PrintFirstLetterOfEachWord
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    System.out.print(arr[i].charAt(0));
		}
	}
}
