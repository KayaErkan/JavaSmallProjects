package _07_methodCreation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("de�i�tireceginiz birimi giriniz");
		
		String birim= scan.nextLine();
		System.out.println("cevrilecek birim miktar�n� giriniz");
		double miktar = scan.nextDouble();
		cevirici(birim , miktar);
		
	}

	public static void cevirici(String birim , double miktar) {
		
		switch (birim) {
		case "saat":
			System.out.println("girdiginiz saat : " + miktar * 3600 + " saniyedir");
			break;
		case "mil":
			System.out.println("girdiginiz mil :" + miktar * 1.6 + " kilometredir");
			break;
		case "k�logram":
			System.out.println("girdiginiz kilogram : " + miktar * 1000 + " Gramd�r");
			break;
		default:
			System.out.println("ge�erli de�erler giriniz");
		}
		
	}
	
	
	
}
