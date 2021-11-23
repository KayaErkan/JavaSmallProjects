package _03_ifStatements;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		
		/*
        Kullanýcýdan vize ve final notlarýný alýnýz.
        Kullanýcýn istediði oranlarda vize ve final yüzdeleri not ile 
        not ortalamasýný hesaplayýp
        not ortalamasýný yazdýrýp 50 ve büyük ise 
        "Tebrikler dersi baþarý ile geçtiniz..." küçük ise
        "Malesef dersten kaldýnýz..." yazdýrýnýz
         */  

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen vize1 notunuzu giriniz");
		
		double vize1 = scan.nextDouble();
		
		System.out.println("Lütfen vize2 notunuzu giriniz");
		
		double vize2 = scan.nextDouble();
		
		System.out.println("Lütfen Final notunuzu giriniz");
		
		double finalNotu = scan.nextDouble();
		
		System.out.println("vize hesaplama oranýný giriniz");
		
		double vO = scan.nextDouble();
		
		System.out.println("Final hesaplama oranýný giriniz");
		
		double fO = scan.nextDouble();
		
		double ortalama = ((vize1+vize2)/2*vO /100 ) + (finalNotu*fO / 100);
		
		if(ortalama >= 50) {
			System.out.println("Tebrikler dersi baþarý ile geçtiniz..." + ortalama);
		}else {
			System.out.println("Malesef dersten kaldýnýz");
		}
		
		
		
		
		
		
		
		
		

	}

}
