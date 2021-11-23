package _16_Abstraction02;

public abstract class AnaAbstract {
	/*
	  ekmek al methodu olusturuyoruz 
	  bu methodu iki ayrý child class da kullanacaðýz
	  Classlarda birine market,diðerine halk ekmek diyelim
	  marketten alýnan ekmegin tanesi 2 tl 
	  Halk ekmektan alýnan ekmegin tanesi de 1.5 tl olsun 
	  müþteri isminde bir class olusturalým.
	  bu classýn içerisinde alýþveriþ isimli bir method olsun 
	  bu method da kullanýcýdan gelen ekemek sayýsýný alýp tutarý hesaplasýn
	  runner class da ise kullanýcýdan ekmek sayýsýný alsýn ve alýþveriþ methodunu cagirsin
	  
	 */
	
	
	public abstract double ekmekAl(int adet);
	
	/*
	  5 farklý market olsun 
	  5 farklý urun alýþveriþi yapýlsýn
	  ürün fýyatlarý farklý olsun 
	  sonra toplam tutarlarý karþýlastýrsýn 
	 */
}
