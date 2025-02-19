// Print a 2 D Array or Matrix in Java

import java.util.*;

public class Print2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}
		int k = 0;
		int[] resArr = new int[row*col]; 
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				resArr[k] = arr[i][j];
				k++;
			}
		}
		System.out.println(Arrays.toString(resArr));
	}

}
