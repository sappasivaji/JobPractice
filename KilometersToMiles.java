package com.shiva.demo;

import java.util.Scanner;




public class KilometersToMiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter distance in kilometers: ");
		double kilometers = sc.nextDouble();
		
		
		//double kilometers = 10.0; // Example value in kilometers
		double miles = kilometers * 0.621371; // Conversion factor from kilometers to miles
		
		System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

	}

}
