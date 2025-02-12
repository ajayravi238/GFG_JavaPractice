// Insert a String into another String in Java

import java.util.Scanner;

public class InsertStringInAnother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String newStr = sc.nextLine();
		int index = sc.nextInt();
		String res = "";
		
		for(int i=0; i<str.length(); i++) {
			res += str.charAt(i);
			
			if(i == index) {
				res += newStr;
			}
		}
		System.out.println(res);
		
	}

}
