package _02_scanner;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		/*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *  
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Lütfen 5 basamaklý bir sayý girinz : ");
		int sayi = scan.nextInt();
		
		int ilkIkiSayi = sayi / 1000;
		
		int sonIkiSayi = sayi % 100;
		
		int ilkIkiSayiToplami =  ilkIkiSayi / 10 + ilkIkiSayi % 10; // 12 yi önce 10' bölüp 1'i elde ettim yine 12 nin % sini alýnca kalan 2 sayýsýný elde ettim
		
		int sonIkiSayiToplami = sonIkiSayi / 10 + sonIkiSayi % 10;
		
		System.out.println("5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlarýn toplamý :" + (ilkIkiSayiToplami + sonIkiSayiToplami));
		
		
		
		
		
		

	}

}
