package _09_while_DoWhile;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
	
 //  belirli bir(kullan�c� girecek)  y�kseklikten bir top serbest dusme ile b�rakil�maktadir.
 //  top serbest b�rak�ld�ktan  sonra s�rekli birakildigi y�ksekli�in 
 //  � 75 '� kadar zeminden yukar� do�ru z�plamaktad�r
 //  Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde olay sonlandirilmaktadir.
 //  Bu ana kadar topun toplam ald��� yolu ve topun zemine  vurma say�s�n� bulunuz.
	   
	    Scanner scan = new Scanner(System.in);
	    System.out.print("topun birakilacagi yuksekligi giriniz : ");
	    
	 double birakilanYukseklik = scan.nextDouble();
	 double toplamYol = birakilanYukseklik;
	 int vurmaSayisi = 0;
	 
	 while (birakilanYukseklik >= 1) {
		birakilanYukseklik *= 0.75;
		toplamYol +=  birakilanYukseklik * 2;
		vurmaSayisi++;
	}
	 System.out.println("Topun zemine vurma say�s� : " + vurmaSayisi);
	 System.out.println("Topun toplam ald�g� yol : " + toplamYol);
	    
	    
	    
	    
	}

}
