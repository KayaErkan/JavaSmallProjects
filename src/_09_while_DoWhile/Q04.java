package _09_while_DoWhile;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
	     * kullan�c�dan al�nan bir sayinin basamak degerlerinin toplamini 
	     * while loop ile hesaplayan bbir method yaz�n�z.
	     */
	  
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Lutfen bir sayi giriniz : ");
	     int sayi = scan.nextInt();
	     rakamTopla(sayi);   
	     
	        

	}

	public static int rakamTopla(int sayi) {
		int toplam = 0;
		
		do {
			toplam += sayi % 10;
			sayi /= 10;
			
		}while (sayi > 0);
		System.out.println("Girdiginiz sayinin rakamlar toplam� : " + toplam);
		return toplam;
		
		
	}

}
