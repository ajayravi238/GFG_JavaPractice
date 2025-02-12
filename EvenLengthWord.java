// Java program to print Even length words in a String

import java.util.Scanner;

public class EvenLengthWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++) {
		    if(arr[i].length()%2 == 0) {
		        System.out.println(arr[i]);
		    }
		}
	}
}
