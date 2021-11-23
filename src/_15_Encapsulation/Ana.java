package _15_Encapsulation;

public class Ana {
	private String ad = "Ahmet";
	private int yas = 40;
	String adres = "Ankara";
	
	public Ana () {
		
	}
	
	
	public Ana(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
		
	}
	
	
	public String getAd() {
		return ad;
	}
	public  int getYas() {
		return yas;
	}


	public synchronized void setAd(String ad) {
		this.ad = ad;
	}


	public synchronized void setYas(int yas) {
		this.yas = yas;
	}


	@Override
	public String toString() {
		return "Ana [ad=" + ad + ", yas=" + yas + ", adres=" + adres + "]";
	}
	
	
	
	
	
}
