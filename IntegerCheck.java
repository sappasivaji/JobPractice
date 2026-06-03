package com.shiva.demo;
import java.util.Scanner;


public class IntegerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      
      if (sc.hasNextInt()) {
		  int number = sc.nextInt();
		  System.out.println("You entered an integer: " + number);
	  } else {
		  System.out.println("You did not enter an integer.");
	  }
       sc.close();
	}

}
