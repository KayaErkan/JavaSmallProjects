package _14_inheritance03;

public class Runner {
	
	/*
-Hayvanlarýn beslenme,barýnma, boyut ve solunum özellikleri  ile ilgili 
 methodlar barýndýran Hayvan isminde bir class oluþturalým

-Hayvan sýnýfýnýn SubClassý bir Kuþ Classý oluþturalým ve 
 bu class ucma ve barýnma methodlarýný içersin

-Hayvan sýnýfýnýn SubClassý bir Balýk Classý oluþturalým ve 
 bu class yuzme ve Solunum methodlarýný içersin

-kuþ sýnýfýnýn SubClassý bir Güversin Classý oluþturalým ve 
bu class beslenme ve boyut methodlarýný içersin

-Balýk sýnýfýnýn SubCLassý bir JaponBaligi classý oluþturalým ve 
bu class solunum methodu içersin ve bu methodu Superclasstan alsýn


--Runner class oluþturalým ve oluþturduðumuz metholarý çaðýralým.
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
