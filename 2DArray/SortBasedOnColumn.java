// Sorting a 2D Array according to values in any given column in Java

import java.util.*;

public class SortBasedOnColumn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}
		int col = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1; j++) {
				if(arr[j][col] > arr[j+1][col]) {
					for(int k=0; k<num; k++) {
						int temp = arr[j][k];
						arr[j][k] = arr[j+1][k];
						arr[j+1][k] = temp;
					}
				}
			}
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
