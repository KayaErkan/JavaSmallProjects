package _03_ifStatements;

import java.util.Scanner;

public class Q00 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alalim
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("L�tfen ya��n�z� giriniz");
		int yas = scan.nextInt();
		System.out.println("L�tfen k�lonuzu giriniz");
		int kilo = scan.nextInt();
		
		if (yas > 0 && yas < 18) { 
				System.out.println("ya��n�z dolay�s�yla kan bag�s� yapamazs�n�z");
				
			}else if (yas >= 18 && (kilo > 0 && kilo < 50)) {
				System.out.println("k�lonuz dolay�s�yla kan bag�s� yapamazs�n�z");
			}else if (yas >= 18 && (kilo > 0 && kilo < 50)){
				System.out.println("kan bag�s� yapabilirsiniz");
			}else {
				System.out.println("L�tfen gecerli degerler giriniz");
			}

	}

}
