package _09_while_DoWhile;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {
		
		/* kullanýcýdan alýnan bir sayýnýn Armstrong sayý olup olmadýgýný kontrol edenprogram yazýn
		 * Armstrong sayý rakamlarýnýn küplerinin toplamýna eþit sayýdýr
		 *  153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen Armstrong oldugunu kontrol edeceginiz tamsayýyý yazýnýz : ");
		int sayi = scan.nextInt();
		int ilkDeger = sayi;
		int rakam;
		int kuplerToplamý = 0;
		while (sayi != 0) {
			rakam =sayi%10;
			sayi /= 10;
			kuplerToplamý += rakam * rakam * rakam;	
		}
		if (kuplerToplamý == ilkDeger) {
			System.out.println("Gayet baþarýlý girdiðiniz sayi armstrong sayýdýr");
		}else {
			System.out.println("Malesef girdiðiniz sayi armstrong sayý deðildir :(");
		}
		
		
		
		

	}

}
