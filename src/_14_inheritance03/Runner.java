package _14_inheritance03;

public class Runner {
	
	/*
-Hayvanlar�n beslenme,bar�nma, boyut ve solunum �zellikleri  ile ilgili 
 methodlar bar�nd�ran Hayvan isminde bir class olu�tural�m

-Hayvan s�n�f�n�n SubClass� bir Ku� Class� olu�tural�m ve 
 bu class ucma ve bar�nma methodlar�n� i�ersin

-Hayvan s�n�f�n�n SubClass� bir Bal�k Class� olu�tural�m ve 
 bu class yuzme ve Solunum methodlar�n� i�ersin

-ku� s�n�f�n�n SubClass� bir G�versin Class� olu�tural�m ve 
bu class beslenme ve boyut methodlar�n� i�ersin

-Bal�k s�n�f�n�n SubCLass� bir JaponBaligi class� olu�tural�m ve 
bu class solunum methodu i�ersin ve bu methodu Superclasstan als�n


--Runner class olu�tural�m ve olu�turdu�umuz metholar� �a��ral�m.
	 */

	public static void main(String[] args) {
		
		Hayvan obj1 = new Hayvan();
		
		obj1.Barinma();
		obj1.Beslenme();
		obj1.Boyut();
		obj1.Solunum();
		
		
		Kus obj2 = new Kus();
		obj2.ucma();
		obj2.barinma();
		
		Balik obj3 = new Balik();
		obj3.solunum();
		obj3.yuzme();
		
		Guvercin obj4 = new Guvercin ();
		obj4.boyut();
		obj4.boyut();
		obj4.beslenme();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
