package _12_Encapsulation;

import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lütfen adýnýzý giriniz:");
		String name = scan.nextLine();
		System.out.println("lütfen yasýnýzý giriniz:");
		int age = scan.nextInt();
		System.out.println("lütfen kilonuzu giriniz:");
		double weight = scan.nextDouble();
		System.out.println("lütfen boyunuzu cm olarak giriniz:");
		double height = scan.nextDouble();
		
		BMI BMI = new BMI(name,age,weight,height);
		
		System.out.println(BMI.bmiHesapla());
		
	}

}
