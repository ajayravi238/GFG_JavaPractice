// Java Program to Find Transpose of Matrix

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
