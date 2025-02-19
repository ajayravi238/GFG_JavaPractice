// Java Program to Find the Normal and Trace of a Matrix

import java.util.Scanner;

public class FindNormalAndTrace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				arr[i][j] = sc.nextInt();
			}			
		}
		int trace = 0, normal = 0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i == j) {
					trace += arr[i][j];
				}
			}
		}
		int sum = 0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				sum += (arr[i][j] * arr[i][j]);
			}
		}
		normal = (int) Math.sqrt(sum);
		System.out.println(normal);
		System.out.println(trace);
	}

}
