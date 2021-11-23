package _06_stringManipulation;

import java.util.Scanner;

public class Q05 {
public static void main(String[] args) {
	
	 //Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
    // Örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.
	
	Scanner scan = new Scanner (System.in);
	System.out.println("adýnýzý soyadýnýzý giriniz");
	String adSoyad =scan.nextLine();
	
	String name1 = adSoyad.substring(0,adSoyad.indexOf(" "));
	String name2 = adSoyad.substring(adSoyad.indexOf(" ") + 1,adSoyad.lastIndexOf(" "));
	String surname =adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
	
	char n1 = name1.charAt(0);
	char n2 = name2.charAt(0);
	char n3 = surname.charAt(0);
	
	System.out.println("adýnýz : " + name1 + " ikinci adýnýz : " + name2 + 
			" soyadýnýz : " + surname);		
	
	System.out.println(n1 + "." + n2 + "." + n3);
	
	
}
}
