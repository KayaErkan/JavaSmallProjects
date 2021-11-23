package _13_taskConstructor;

public class BookClass {
	/*
     * programý 2 Constructor'a sahip olacak bir Book class yazýn.
     * iki kitap creat ederek disPlay metodu ile kitaplarý yazdýrýýnýz.
     */
    
	String title,auther;
	int publish;
	static int pages;
	public BookClass(String title, String auther, int publish) {

		this.title = title;
		this.auther = auther;
		this.publish = publish;
	}
	
	public static void main(String[] args) {
		BookClass kitap1 = new BookClass ("suc ve ceza","Dostoyevski" , 2000);
		BookClass kitap2 = new BookClass ("calikusuu","Resat Nuri" , 1935);
		kitap1.disPlay();
		kitap2.disPlay();
		
	}

	private void disPlay() {
        System.out.println("kitabiniz : "+title+" yazari : "+auther+" yayýn yili :"+publish);
		
	}
	
}
