package _16_Abstraction;

import java.util.Scanner;

public class Runner {

	//static Dikd�rtgen d = new Dikd�rtgen();
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		
		Dikd�rtgen d2 = new Dikd�rtgen(5,10);
		/*
		System.out.println("k�sa kenar : " );
		d.kk = scan.nextInt();
		System.out.println("uzun kenar : " );
		d.uk = scan.nextInt();
		*/
		System.out.println("Dikd�rtgenin cevresi : " + d2.cevre());
		System.out.println("Dikd�rtgenin alan� : " + d2.alan());
	}

}
