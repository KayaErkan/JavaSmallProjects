package _03_ifStatements;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		
		/*
        Kullan�c�dan vize ve final notlar�n� al�n�z.
        Kullan�c�n istedi�i oranlarda vize ve final y�zdeleri not ile 
        not ortalamas�n� hesaplay�p
        not ortalamas�n� yazd�r�p 50 ve b�y�k ise 
        "Tebrikler dersi ba�ar� ile ge�tiniz..." k���k ise
        "Malesef dersten kald�n�z..." yazd�r�n�z
         */  

		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen vize1 notunuzu giriniz");
		
		double vize1 = scan.nextDouble();
		
		System.out.println("L�tfen vize2 notunuzu giriniz");
		
		double vize2 = scan.nextDouble();
		
		System.out.println("L�tfen Final notunuzu giriniz");
		
		double finalNotu = scan.nextDouble();
		
		System.out.println("vize hesaplama oran�n� giriniz");
		
		double vO = scan.nextDouble();
		
		System.out.println("Final hesaplama oran�n� giriniz");
		
		double fO = scan.nextDouble();
		
		double ortalama = ((vize1+vize2)/2*vO /100 ) + (finalNotu*fO / 100);
		
		if(ortalama >= 50) {
			System.out.println("Tebrikler dersi ba�ar� ile ge�tiniz..." + ortalama);
		}else {
			System.out.println("Malesef dersten kald�n�z");
		}
		
		
		
		
		
		
		
		
		

	}

}
