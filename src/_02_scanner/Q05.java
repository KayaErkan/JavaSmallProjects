package _02_scanner;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13    
       k�k almak i�in Math.sqrt(sayi) metodunu kullan�n�z 
         */

		Scanner scan = new Scanner(System.in);
		System.out.println("a dik kenar� giriniz : ");
		int a = scan.nextInt();
		
		System.out.println("b dik kenar� giriniz : ");
		int b = scan.nextInt();
		
		double h =Math.sqrt((a*a) + (b*b));
		System.out.println("��genimizin hipoten�s� : " + h);
		
		
		
		
		
		
		
		

	}

}
