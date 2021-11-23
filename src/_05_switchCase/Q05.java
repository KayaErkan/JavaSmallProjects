package _05_switchCase;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * bakiye ��renme para �ekme  yat�rma ve ��k�� i�lemlerinin oldu�u bir bankamatik  
		 * program� kodlay�n�z
		 */

		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		
		
		
		System.out.println("1: bakiye �grenme");
		System.out.println("2: Para yat�rma");
		System.out.println("3: para �ekme");
		System.out.println("4: Sistemden ��k��");
		
		int 
		islem = scan.nextInt();
		
		switch (islem) {
		case 1 :
			System.out.println("Bakiyeniz : " + bakiye + "tl dir");
			break;
		case 2:
			System.out.println("ne kadar yat�racaks�n�z");
			int miktar = scan.nextInt();
			
			bakiye += miktar;
			System.out.println("Bakiyeniz : " + bakiye + "tl'dir");
			break;
			
		case 3:
			System.out.println("Ne kadar �ekkeceksiniz? ");
			miktar =scan.nextInt();
			
			bakiye -= miktar;
			System.out.println("Bakiyeniz : " + bakiye + " tl'dir");
			break;
		case 4:
			System.out.println("Sistemden c�k�l�yor......");
		default:
			System.out.println("Gecersiz islem");
			break;	
		}
		
		System.out.println("*****************************");
        System.out.println("JAVA BANK ATM'ye Ho�geldiniz...");
        
        System.out.println("1. islem : bak�ye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : c�k�s");
        
        int bak�ye =5000;
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen yapacaginiz islemi seciniz: ");
        int secim=scanner.nextInt();
        
        switch (secim) {
       case 1: {
           System.out.println("bak�yeniz: " +bak�ye);
           
           break;
       }
       case 2: {
           System.out.print("cekeceginiz miktar� giriniz : " );
           int cekilenMiktar=scanner.nextInt();
           if (cekilenMiktar>bak�ye) {
               System.out.println("bak�yeniz yeterli degil");
               
           }else {
               bak�ye-=cekilenMiktar;//bak�yeden cekilenMiktar� ��kard�k
               System.out.println("yeni bak�yeniz :"+bak�ye);
           }
           break;
       }
       case 3: {
           System.out.print("yat�racaginiz miktari giriniz: " );
           int yatirilanmiktar=scanner.nextInt();
           bak�ye+=yatirilanmiktar; //bak�yeye yatirilanmiktar ekledik
           System.out.println("yeni bak�yeniz :"+bak�ye);
           break;
       }
       case 4: {
           System.out.println("islemden cikisiniz yap�l�yor: " );
           
           break;
       }
       default:
           
       }
		
		
		
		
		
		
	}

}
