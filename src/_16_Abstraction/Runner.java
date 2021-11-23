package _16_Abstraction;

import java.util.Scanner;

public class Runner {

	//static Dikdörtgen d = new Dikdörtgen();
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		Dikdörtgen d2 = new Dikdörtgen(5,10);
		/*
		System.out.println("kýsa kenar : " );
		d.kk = scan.nextInt();
		System.out.println("uzun kenar : " );
		d.uk = scan.nextInt();
		*/
		System.out.println("Dikdörtgenin cevresi : " + d2.cevre());
		System.out.println("Dikdörtgenin alaný : " + d2.alan());
	}

}
