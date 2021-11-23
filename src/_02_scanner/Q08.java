package _02_scanner;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		
		/*
	      * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
	      * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
	      */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Vize1 notunu giriniz : ");
		double vize1 = scanner.nextDouble();
		
		System.out.print("Vize2 notunu giriniz : ");
		double vize2 = scanner.nextDouble();
		
		System.out.print("final notunu giriniz : ");
		double finalNotu = scanner.nextDouble();
		
		double gecmeNotu = (vize1 + vize2) / 2 * 0.30 + (finalNotu * 0.70);
		System.out.println("Ge�me Notunuz : " + gecmeNotu);
		
		
		
		
		

	}

}
