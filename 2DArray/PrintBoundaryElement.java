// Java Program to Print Boundary Elements of the Matrix

import java.util.*;

public class PrintBoundaryElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++) {
		    for(int j=0; j<size; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		for(int i=0; i<size; i++) {
		    for(int j=0; j<size; j++) {
		        if(i == 0 || j == 0 || i == size-1 || j == size-1) {
		        	System.out.print(arr[i][j] + " ");
		        }
		        else {
		        	System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}
