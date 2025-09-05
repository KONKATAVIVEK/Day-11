package com.codegnan.arrays;

import java.util.Scanner;

public class Averageelements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        int[] numbers = new int[n];
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }
		        int sum = 0;
		        for (int number : numbers) {
		            sum += number;
		        }
		        double average = (double) sum / n;
		        System.out.println("Average: " + average);

		        scanner.close();
		    }

	}


