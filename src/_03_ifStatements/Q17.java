package _03_ifStatements;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		
		/*kullan�c� ttaraf�ndan girilen bir say�n�n 
		 * mutlak de�erini yazd�rmak i�in bir program yaz�n
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz : ");
		int sayi = scan.nextInt();
		
		if (sayi < 0) {
			sayi*=(-1);
			System.out.println("Say�m�z�n mutlak de�eri : " + sayi);
		}else {
			System.out.println("Say�m�z�n mutlak de�eri : " + sayi);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
