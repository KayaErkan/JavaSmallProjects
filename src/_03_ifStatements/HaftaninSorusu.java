package _03_ifStatements;

import java.util.Scanner;

public class HaftaninSorusu {

	public static void main(String[] args) {
		
		/*
	    A sehrinden ucmak isteyen bir kisi B sehrine 500km C sehrine  700km  D sehrine  900 km mesafededir.
	    km birim fiyati : 0.10$ 
	    12 yasindan kucukse toplam fiyat %50 indirim 
	    12 ve 24 yas arasindaysa 10% indirim
	    65 yasindan buyukse 30% indirim
	    gidis donus bilet alirsa yas indirimlerinden haric 20% indirim
	    bu kosullara gore yolcudan gidecegi mesafeyi isteyip ucak bilet ucretini hesaplayan program yazınız
	     */
		
		Scanner scan = new Scanner (System.in);	
		System.out.println("Lutfen seyahat tipinizi seciniz tek yon icin 1 ,cift yon icin 2 giriniz");
		int tip =scan.nextInt();
		 
		System.out.println("Lutfen gideceginiz sehir B ise 1 , C ise 2 , D ise 3 seklinde yazarak giriniz");
		int gidilecekSehir = scan.nextInt();
	
		 System.out.println("Lutfen yasinizi giriniz");
		 int yas = scan.nextInt();
		 
		double fiyat = 0.10;
		
		double B = fiyat * 500;
		double C = fiyat * 700;
		double D = fiyat * 900;
		
		if(tip == 2) {
			if (gidilecekSehir == 1) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.5 * 0.2)); // 0.2 cift yon indirimini gostermektedir
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.1 * 0.2));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.2));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.3 *0.2));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
					
			}else if(gidilecekSehir == 2) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.5 * 0.2));
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.1 * 0.2));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.2));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.3 *0.2));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
			}else if(gidilecekSehir == 3) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.5 * 0.2));
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.1 * 0.2));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.2));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.3 *0.2));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
			}else {
				System.out.println("Lutfen seyahat etmek istediginiz sehri tekrar giriniz");
			}
		}else if(tip ==1) {
			if (gidilecekSehir == 1) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.5 ));
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (B * 0.1 ));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatinizz : " + (B));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatinizz : " + (B * 0.3));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
					
			}else if(gidilecekSehir == 2) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.5));
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.1));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatiniz : " + (C));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatiniz : " + (C * 0.3));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
			}else if(gidilecekSehir == 3) {
				if(yas >= 0 && yas <= 12) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.5));
				}else if (yas > 12 && yas <= 24) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.1));
				}else if (yas > 24 && yas <=64) {
					System.out.println("Bilet Fiyatiniz : " + (D));
				}else if(yas >= 65) {
					System.out.println("Bilet Fiyatiniz : " + (D * 0.3));
				}else {
					System.out.println("Lutfen Yasinizi tekrar giriniz");
				}
			}else {
				System.out.println("Lutfen seyahat etmek istediginiz sehri tekrar giriniz");
			}
		}
		else {
			System.out.println("Lutfen seyahat tipinizi tekrar giriniz");
		}
		
		
		
		
		
		
		
		
		

	}

}
