package _16_Abstraction02;

public abstract class AnaAbstract {
	/*
	  ekmek al methodu olusturuyoruz 
	  bu methodu iki ayr� child class da kullanaca��z
	  Classlarda birine market,di�erine halk ekmek diyelim
	  marketten al�nan ekmegin tanesi 2 tl 
	  Halk ekmektan al�nan ekmegin tanesi de 1.5 tl olsun 
	  m��teri isminde bir class olustural�m.
	  bu class�n i�erisinde al��veri� isimli bir method olsun 
	  bu method da kullan�c�dan gelen ekemek say�s�n� al�p tutar� hesaplas�n
	  runner class da ise kullan�c�dan ekmek say�s�n� als�n ve al��veri� methodunu cagirsin
	  
	 */
	
	
	public abstract double ekmekAl(int adet);
	
	/*
	  5 farkl� market olsun 
	  5 farkl� urun al��veri�i yap�ls�n
	  �r�n f�yatlar� farkl� olsun 
	  sonra toplam tutarlar� kar��last�rs�n 
	 */
}
