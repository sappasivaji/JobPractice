package com.shiva.demo;
import java.util.Scanner;
import java.util.scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of Subject 1:");
		double sub1 = sc.nextDouble();
		
		System.out.print("Enter marks of Subject 2:");
		double sub2 = sc.nextDouble();
		
		System.out.print("Enter marks of Subject 3:");
		double sub3 = sc.nextDouble();
		
		double percentage = (sub1 + sub2 + sub3) / 3;
		double cgpa = percentage / 9.5;
		
		System.out.println("Percentage = " + percentage);
		System.out.println("CGPA = " + cgpa);
		
		sc.close();

		 
       }

}
