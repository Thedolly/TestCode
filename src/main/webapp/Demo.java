package main.webapp;

import java.util.Scanner;

public class Demo {
	
	
	
	

	public Demo() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("Enter array element");
		int a[][] = new int[n][m];
		
		for(int i = 0 ; i<a.length ;i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<a.length ; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
