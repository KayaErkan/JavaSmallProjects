package _06_stringManipulation;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// kullanýcýdan tek seferde alacagýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrnýz
		// ad ayrý soyad ayrý sekilde ekrana yazdýrnýz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("adýnýzý soyadýnýzý giriniz");
		String adSoyad =scan.nextLine();
		String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
		String soyad = adSoyad.substring(adSoyad.indexOf(" ")+1);
		System.out.println("adýnýz : " + ad + " soyadýnýz : " + soyad);
		
		
	}

}
