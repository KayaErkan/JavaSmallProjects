package _04_TernaryOperator;

import java.util.Scanner;

public class Soru_01 {

	public static void main(String[] args) {
		
		/* 
        Kullanicidan bir sayi aliniz
        Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen bir say� giriniz");
		int sayi = scan.nextInt();
		
		if (sayi >= 0) {
			String result = (sayi < 10  ? "rakam" : "Pozitif say�");
			System.out.println(result);
		}else {
			System.out.println("negatif sayi ");
		}
		
		// tek kullan�c�dan isteme yapt�m o y�zden her ikisi i�in sonu� d�nd�r�yor
		
		
		if(sayi >= 0) {
			if(sayi < 10) {
				System.out.println("rakam");
			}else  {
				System.out.println("pozitif say�");
			}
		}else {
			System.out.println("negatif sayi ");
		}
		
		
		
		
		
		
		

	}

}
