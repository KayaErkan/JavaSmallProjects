package _02_scanner;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		
		/*  Problem Tanýmý
        Kullanýcýdan a,b ve c sayýlarýný okuyarak aþaðýdaki iþlemi yapan kodu yazýnýz
        a'nýn karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
        Örnek Ekran Çýktýsý
        a sayýsýný giriniz: 5
        b sayýsýný giriniz: 3
        c sayýsýný giriniz: 1
        sonuç : 5.333333333333333
        */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsayýlarýný giriniz : ");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double sonuc = ((a*a)- (b*b)) / (3*c);
		
		System.out.println ("Ýþlemin sonucu : " + sonuc);
		
		
		
		
		
		
		
		
		

	}

}
