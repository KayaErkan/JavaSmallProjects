package _06_stringManipulation;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// kullan�c�dan tek seferde alacag�n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�rn�z
		// ad ayr� soyad ayr� sekilde ekrana yazd�rn�z
		
		Scanner scan = new Scanner (System.in);
		System.out.println("ad�n�z� soyad�n�z� giriniz");
		String adSoyad =scan.nextLine();
		String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
		String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
		System.out.println("ad�n�z : " + ad + " soyad�n�z : " + soyad);
		
		
	}

}
