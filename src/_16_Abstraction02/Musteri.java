package _16_Abstraction02;

import java.util.Scanner;

public class Musteri {
	
    AnaAbstract anaabstract;
	static Scanner scan = new Scanner (System.in);
	
	public  void alýsVeris() {
		System.out.println("Ekmek Hesaplamasý");
		System.out.println("Kaç ekmek almak istersiniz");
		int x = scan.nextInt();
		
		System.out.println("Ekmek Fiyatý : " + anaabstract.ekmekAl(x)/x + "TL");
		System.out.println("Odeyeceginiz miktar : " + anaabstract.ekmekAl(x) + "TL");
		
		
	}
}
