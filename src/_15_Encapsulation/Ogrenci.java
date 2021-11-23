package _15_Encapsulation;

public class Ogrenci {

	/*
	  String ögrenci adý
	  String telefon
	  int ögrenci num
	   farklý bir classtan 
	   klavyeden girilen 10 adet ogrenciye ait bilgiyi ekranda görrmek istiyoruz
	 */
	
	 private String isim = "Erkan";
	 private String telefon = "5556963225";
	 private int numara = 798;
	 
	 
	 public Ogrenci () {
		 
	 }


	public Ogrenci(String isim, String telefon, int numara) {
		super();
		this.isim = isim;
		this.telefon = telefon;
		this.numara = numara;
	}


	public synchronized String getIsim() {
		return isim;
	}


	public synchronized void setIsim(String isim) {
		this.isim = isim;
	}


	public synchronized String getTelefon() {
		return telefon;
	}


	public synchronized void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public synchronized int getNumara() {
		return numara;
	}


	public synchronized void setNumara(int numara) {
		this.numara = numara;
	}


	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", telefon=" + telefon + ", numara=" + numara + "]";
	}
	 
	 
	
	
	
	
}
