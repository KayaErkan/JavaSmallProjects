package _16_Abstraction02;

import java.util.Scanner;

public class Musteri {
	
    AnaAbstract anaabstract;
	static Scanner scan = new Scanner (System.in);
	
	public  void al�sVeris() {
		System.out.println("Ekmek Hesaplamas�");
		System.out.println("Ka� ekmek almak istersiniz");
		int x = scan.nextInt();
		
		System.out.println("Ekmek Fiyat� : " + anaabstract.ekmekAl(x)/x + "TL");
		System.out.println("Odeyeceginiz miktar : " + anaabstract.ekmekAl(x) + "TL");
		
		
	}
}
