package _02_scanner;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        �rnek Ekran ��kt�s�
        a say�s�n� giriniz: 5
        b say�s�n� giriniz: 3
        c say�s�n� giriniz: 1
        sonu� : 5.333333333333333
        */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsay�lar�n� giriniz : ");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double sonuc = ((a*a)- (b*b)) / (3*c);
		
		System.out.println ("��lemin sonucu : " + sonuc);
		
		
		
		
		
		
		
		
		

	}

}
