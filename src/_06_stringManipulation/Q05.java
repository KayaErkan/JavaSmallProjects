package _06_stringManipulation;

import java.util.Scanner;

public class Q05 {
public static void main(String[] args) {
	
	 //Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
    // �rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.
	
	Scanner scan = new Scanner (System.in);
	System.out.println("ad�n�z� soyad�n�z� giriniz");
	String adSoyad =scan.nextLine();
	
	String name1 = adSoyad.substring(0,adSoyad.indexOf(" "));
	String name2 = adSoyad.substring(adSoyad.indexOf(" ") + 1,adSoyad.lastIndexOf(" "));
	String surname =adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
	
	char n1 = name1.charAt(0);
	char n2 = name2.charAt(0);
	char n3 = surname.charAt(0);
	
	System.out.println("ad�n�z : " + name1 + " ikinci ad�n�z : " + name2 + 
			" soyad�n�z : " + surname);		
	
	System.out.println(n1 + "." + n2 + "." + n3);
	
	
}
}
