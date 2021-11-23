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
		System.out.println("Lütfen bir sayý giriniz");
		int sayi = scan.nextInt();
		
		if (sayi >= 0) {
			String result = (sayi < 10  ? "rakam" : "Pozitif sayý");
			System.out.println(result);
		}else {
			System.out.println("negatif sayi ");
		}
		
		// tek kullanýcýdan isteme yaptým o yüzden her ikisi için sonuç döndürüyor
		
		
		if(sayi >= 0) {
			if(sayi < 10) {
				System.out.println("rakam");
			}else  {
				System.out.println("pozitif sayý");
			}
		}else {
			System.out.println("negatif sayi ");
		}
		
		
		
		
		
		
		

	}

}
