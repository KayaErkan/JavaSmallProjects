package _03_ifStatements;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		 /*  Problem Tan�m�
        Kullan�c�dan �� adet say� alarak bu say�lar�n
        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
        (ipucu: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
        ba�lant�s�ndan yararlanabilirsiniz)
        �rnek Ekran ��kt�s�
        birinci kenar� giriniz: 2
        ikinci kenar� giriniz 15
        ���nc� kenar� giriniz: 7
        Bu bir dik ��gen de�ildir.
        Bu bir dik ��gendir
     */
     

		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen 3 tane pozitif tamsay� giriniz");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a+b > c && a-b < c && a+c > b && a-c < b && b+c > a && b-c < a) {
			if((a*a) + (b*b) == (c*c)) {
				System.out.println("Bu bir dik ��gendir");
			}else if ((a*a) + (c*c) == (b*b)) {
				System.out.println("Bu bir dik ��gendir");
			}else if ((b*b) + (c*c) == (a*a)) {
				System.out.println("Bu bir dik ��gendir");
			}else {
				System.out.println("Bu bir dik ��gen de�ildir");
			}
		}else {
			System.out.println("Girdi�iniz kenarlar bir ��gen belirtmez");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
