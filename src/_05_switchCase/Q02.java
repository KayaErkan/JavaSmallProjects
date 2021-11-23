package _05_switchCase;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		//  2- kullanýcýdan 3 basamaklý bir sayýyý alýn ve yazý ile yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen 3 basamaklý bir sayý giriniz : ");
		int sayi =scan.nextInt();
		
		// 316  girdik diyelim yazmamýz gerekenler üç yüz on altý
		
		int yuzler = sayi / 100;
		int onlar = (sayi / 10) % 10;
		int birler = sayi % 10;
		
		switch (yuzler) {
		case 1:
			System.out.println("");
			break;
		case 2:
			System.out.println("iki");
			break;	
		case 3:
			System.out.println("üç");
			break;	
		case 4:
			System.out.println("dört");
			break;	
		case 5:
			System.out.println("beþ");
			break;
		case 6:
			System.out.println("altý");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
		}
		System.out.println("yüz");
		
		
		switch (onlar) {
		case 1:
			System.out.println("on");
			break;
		case 2:
			System.out.println("yirmi");
			break;	
		case 3:
			System.out.println("otuz");
			break;	
		case 4:
			System.out.println("kýrk");
			break;	
		case 5:
			System.out.println("elli");
			break;
		case 6:
			System.out.println("altmýþ");
			break;
		case 7:
			System.out.println("yetmiþ");
			break;
		case 8:
			System.out.println("seksen");
			break;
		case 9:
			System.out.println("doksan");
			break;
		}
		
		switch (birler) {
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;	
		case 3:
			System.out.println("üç");
			break;	
		case 4:
			System.out.println("dört");
			break;	
		case 5:
			System.out.println("beþ");
			break;
		case 6:
			System.out.println("altý");
			break;
		case 7:
			System.out.println("yedi");
			break;
		case 8:
			System.out.println("sekiz");
			break;
		case 9:
			System.out.println("dokuz");
			break;
		}
		

	}

}
