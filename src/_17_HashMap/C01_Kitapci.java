package _17_HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;



public class C01_Kitapci {

	static Scanner scan = new Scanner(System.in);
	static HashMap<Integer, String> kitap = new HashMap<>();
	
	
	public static void main(String[] args) {
				
		/* Bir kitapci icin program yapalim
	     *
	     * Kitap no 1000'den baslayarak sirali no olsun
	     * Her kitap icin kitapAdi, yazarAdi,yayinYili,fiyati bilgilerini girelim
	     *
	     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
	     * 1- kitap ekle
	     * 2- numara ile kitap goruntule
	     * 3- bilgi ile kitap goruntule
	     * 4- numara ile kitap sil
	     * 5- Tum kitaplari listele
	     * 6- Bitir
	     */
		
		topluKitapEkle();
		menu();
		no�leGoruntule();
	}


	

	private static void menu() {
		System.out.println("1-Kitap ekle "
				+ "\n2-Numara ile kitap g�r�nt�le "
				+ "\n3-Bilgi ile kitap g�r�nt�le "
				+ "\n4-Numara ile kitap sil "
				+ "\n5-T�m kitaplar� listele "
				+ "\n6-��k��");
		System.out.println("i�lem numaran�z� giriniz:");
		int secim = scan.nextInt();
		  
		       
		        switch(secim) {
		        case 1: 
		            KitapEkle();
		            break;
		        case 2: 
		            no�leGoruntule();
		            break;
		        case 3:     
		            BilgiIleGoruntule();
		            break;
		            
		        case 4:
		           no�leS�l();
		            
		            break;
		            
		        case 5:
		            Listele();
		            break;
		        case 6:
		        	c�k�s();
		        }
		   	
	}
	private static void c�k�s() {
		
		
	}




	private static void Listele() {
		for (Entry<Integer, String> entry : kitap.entrySet())
        {
	System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
		}
		
	}




	private static void no�leS�l() {
		
		
	}




	private static void BilgiIleGoruntule() {
		scan.nextLine();
		System.out.println("hangi bilgi ile g�r�nt�leme yapmak istiyorsunuz");
		String bilgi = scan.nextLine();
		int flag = 0;
		for (Entry<Integer, String> entry : kitap.entrySet())
        {
			
			if(entry.getValue().contains(bilgi)) {
	   System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
			flag = 1;
			}
			
		}
		if(flag == 0) {
			System.out.println("arad�g�n�z bilgi ile alakal�kitap bulunamad�");
			
		}
	}




	private static void KitapEkle() {
		
		
	}




	private static void no�leGoruntule() {
		scan.nextLine();
		System.out.println("Listelemek istediginiz kitap numaras�n� giriniz:");
		int kitapNo = scan.nextInt();
		System.out.println(kitap.get(kitapNo));
		
	}

	 public static void topluKitapEkle() {
	        kitap.put(9999, "ali can evde, ali han, 2001, 11");
	        kitap.put(9998, "ali can yolda, ali han, 2005, 10");
	        kitap.put(9997, "yanlizlik, Veli Kul, 2005, 21");
	        kitap.put(9996, "Sen, Ayse Unal, 2005, 30");        
	    }
}
