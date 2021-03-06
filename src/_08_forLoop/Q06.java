package _08_forLoop;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*  Problem Tanımı
	       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
	​
	       Örnek Ekran çıktısı
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25
	​
	       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
	       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
	       ekrana basan bir kod yazabilirsiniz.
	    */
	        Scanner scan = new Scanner(System.in);
	        System.out.print("pozitif bir tam sayı giriniz : ");
	        int sayi = scan.nextInt();
	     
	        for (int satir = 1; satir <= sayi; satir++) {
				for (int sütun = 1; sütun <= sayi; sütun++) {
					System.out.print(" " + (satir*sütun));
				}
				System.out.println();
			}

	}

}
