package _03_ifStatements;

import java.util.Scanner;

public class Q00 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alalim
        // 18 yasindan kucuk ise kan bagisi yapamaz
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen yaşınızı giriniz");
		int yas = scan.nextInt();
		System.out.println("Lütfen kılonuzu giriniz");
		int kilo = scan.nextInt();
		
		if (yas > 0 && yas < 18) { 
				System.out.println("yaşınız dolayısıyla kan bagısı yapamazsınız");
				
			}else if (yas >= 18 && (kilo > 0 && kilo < 50)) {
				System.out.println("kılonuz dolayısıyla kan bagısı yapamazsınız");
			}else if (yas >= 18 && (kilo > 0 && kilo < 50)){
				System.out.println("kan bagısı yapabilirsiniz");
			}else {
				System.out.println("Lütfen gecerli degerler giriniz");
			}

	}

}
