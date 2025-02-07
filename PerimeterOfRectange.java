// Java Program to Find the Perimeter of a Rectangle

import java.util.Scanner;

public class PerimeterOfRectange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		int P = ((2*h) + (2*b));
		System.out.println(P);
	}

}
