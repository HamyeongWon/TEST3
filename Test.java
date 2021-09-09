package test;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		sc.close();

		double avg = score[a1 - 1] + score[a2 - 1];
		System.out.printf("%.1f", avg);
	}
}
