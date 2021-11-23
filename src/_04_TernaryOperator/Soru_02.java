package _04_TernaryOperator;

import java.util.Scanner;

public class Soru_02 {

	public static void main(String[] args) {
		
		/*
        Kullanicidan bir character girmesini isteyiniz
     Character harf ise kucuk harf olup olmadigini kontrol ediniz
     Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
     Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
     Harf degilse ekrana "Harf degil" yazdiriniz
     97:a  122:z ascii deðeri
      
     */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bir karakter giriniz");
		char karakter = scan.next().charAt(0);
		
		System.out.println(((karakter <= 'z' && karakter >= 'a') ||
		(karakter >= 'A' && karakter <= 'Z')) ? 
		((karakter <= 122 &&  karakter >= 97)? "Küçük Harf" : "Büyük harf"): "Harf deðil" );
		
		// tek kullanýcýdan isteme yaptým o yüzden her ikisi için sonuç döndürüyor
		
		if(karakter <= 'z' && karakter >= 'a') {
			System.out.println("Küçük Harf");
			
		}else if (karakter >= 'A' && karakter <= 'Z') {
			System.out.println("Büyük harf");
		}
		else {
			System.out.println("Harf deðil");
		}
		
		
		
		
		
		
		
		
		

	}

}
