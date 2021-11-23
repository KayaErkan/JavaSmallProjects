package _05_switchCase;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * bakiye öğrenme para çekme  yatırma ve çıkış işlemlerinin olduğu bir bankamatik  
		 * programı kodlayınız
		 */

		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		
		
		
		System.out.println("1: bakiye ögrenme");
		System.out.println("2: Para yatırma");
		System.out.println("3: para çekme");
		System.out.println("4: Sistemden çıkış");
		
		int 
		islem = scan.nextInt();
		
		switch (islem) {
		case 1 :
			System.out.println("Bakiyeniz : " + bakiye + "tl dir");
			break;
		case 2:
			System.out.println("ne kadar yatıracaksınız");
			int miktar = scan.nextInt();
			
			bakiye += miktar;
			System.out.println("Bakiyeniz : " + bakiye + "tl'dir");
			break;
			
		case 3:
			System.out.println("Ne kadar çekkeceksiniz? ");
			miktar =scan.nextInt();
			
			bakiye -= miktar;
			System.out.println("Bakiyeniz : " + bakiye + " tl'dir");
			break;
		case 4:
			System.out.println("Sistemden cıkılıyor......");
		default:
			System.out.println("Gecersiz islem");
			break;	
		}
		
		System.out.println("*****************************");
        System.out.println("JAVA BANK ATM'ye Hoşgeldiniz...");
        
        System.out.println("1. islem : bakıye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : cıkıs");
        
        int bakıye =5000;
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen yapacaginiz islemi seciniz: ");
        int secim=scanner.nextInt();
        
        switch (secim) {
       case 1: {
           System.out.println("bakıyeniz: " +bakıye);
           
           break;
       }
       case 2: {
           System.out.print("cekeceginiz miktarı giriniz : " );
           int cekilenMiktar=scanner.nextInt();
           if (cekilenMiktar>bakıye) {
               System.out.println("bakıyeniz yeterli degil");
               
           }else {
               bakıye-=cekilenMiktar;//bakıyeden cekilenMiktarı çıkardık
               System.out.println("yeni bakıyeniz :"+bakıye);
           }
           break;
       }
       case 3: {
           System.out.print("yatıracaginiz miktari giriniz: " );
           int yatirilanmiktar=scanner.nextInt();
           bakıye+=yatirilanmiktar; //bakıyeye yatirilanmiktar ekledik
           System.out.println("yeni bakıyeniz :"+bakıye);
           break;
       }
       case 4: {
           System.out.println("islemden cikisiniz yapılıyor: " );
           
           break;
       }
       default:
           
       }
		
		
		
		
		
		
	}

}
