package _02_scanner;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
        Bir dik üçgenin iki dik kenarýný alarak hipotenüsünü hesaplayan kod yazýnýz.
        Örnek Ekran Çýktýsý
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       kök almak için Math.sqrt(sayi) metodunu kullanýnýz 
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("a dik kenarý giriniz : ");
		int a = scan.nextInt();
		
		System.out.println("b dik kenarý giriniz : ");
		int b = scan.nextInt();
		
		double h =Math.sqrt((a*a) + (b*b));
		System.out.println("Üçgenimizin hipotenüsü : " + h);
		
		
		
		
		
		
		
		

	}

}
