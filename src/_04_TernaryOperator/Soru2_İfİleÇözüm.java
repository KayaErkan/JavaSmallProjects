package _04_TernaryOperator;

import java.util.Scanner;

public class Soru2_�f�le��z�m {

	public static void main(String[] args) {
		
		/*
        Kullanicidan bir character girmesini isteyiniz
     Character harf ise kucuk harf olup olmadigini kontrol ediniz
     Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
     Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
     Harf degilse ekrana "Harf degil" yazdiriniz
     97:a  122:z ascii de�eri
      
     */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir karakter giriniz");
		char karakter = scan.next().charAt(0);
		
		if(karakter <= 'z' && karakter >= 'a') {
			System.out.println("K���k Harf");
			
		}else if (karakter >= 'A' && karakter <= 'Z') {
			System.out.println("B�y�k harf");
		}
		else {
			System.out.println("Harf de�il");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
