package _09_while_DoWhile;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {
		
		/* kullan�c�dan al�nan bir say�n�n Armstrong say� olup olmad�g�n� kontrol edenprogram yaz�n
		 * Armstrong say� rakamlar�n�n k�plerinin toplam�na e�it say�d�r
		 *  153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen Armstrong oldugunu kontrol edeceginiz tamsay�y� yaz�n�z : ");
		int sayi = scan.nextInt();
		int ilkDeger = sayi;
		int rakam;
		int kuplerToplam� = 0;
		while (sayi != 0) {
			rakam =sayi%10;
			sayi /= 10;
			kuplerToplam� += rakam * rakam * rakam;	
		}
		if (kuplerToplam� == ilkDeger) {
			System.out.println("Gayet ba�ar�l� girdi�iniz sayi armstrong say�d�r");
		}else {
			System.out.println("Malesef girdi�iniz sayi armstrong say� de�ildir :(");
		}
		
		
		
		

	}

}
