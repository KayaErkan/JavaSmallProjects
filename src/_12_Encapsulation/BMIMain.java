package _12_Encapsulation;

import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("l�tfen ad�n�z� giriniz:");
		String name = scan.nextLine();
		System.out.println("l�tfen yas�n�z� giriniz:");
		int age = scan.nextInt();
		System.out.println("l�tfen kilonuzu giriniz:");
		double weight = scan.nextDouble();
		System.out.println("l�tfen boyunuzu cm olarak giriniz:");
		double height = scan.nextDouble();
		
		BMI BMI = new BMI(name,age,weight,height);
		
		System.out.println(BMI.bmiHesapla());
		
	}

}
