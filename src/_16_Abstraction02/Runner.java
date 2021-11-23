package _16_Abstraction02;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Musteri m = new Musteri ();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Nereden slýþveriþ yapacaskýnýz (1-Market / 2- Halk Ekmek)");
		int secim =scan.nextInt();
		if(secim == 1) {
			m.anaabstract = new Market();
			m.alýsVeris();
		}else if(secim == 2) {
			m.anaabstract = new HalkEkmek();
			m.alýsVeris();
		}else {
			System.out.println("Gecerli deger giriniz");
		}
	

		
		
		
		
	}

}
