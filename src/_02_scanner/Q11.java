package _02_scanner;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		/*
		 *  Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen bir Fahrenheit deðeri giriniz");
		
		double f =scan.nextDouble();
		
		double c = (f-32)*5/9;
		
		System.out.println("celcius olarak : " + c);
		
		
		
		
	}

}
