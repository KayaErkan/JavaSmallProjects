package _03_ifStatements;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		/*kullanýcý ttarafýndan girilen bir sayýnýn 
		 * mutlak deðerini yazdýrmak için bir program yazýn
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz : ");
		int sayi = scan.nextInt();
		
		if (sayi < 0) {
			sayi*=(-1);
			System.out.println("Sayýmýzýn mutlak deðeri : " + sayi);
		}else {
			System.out.println("Sayýmýzýn mutlak deðeri : " + sayi);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
