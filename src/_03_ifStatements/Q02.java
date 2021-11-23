package _03_ifStatements;

import java.util.Scanner;

public class Q02 {
public static void main(String[] args) {
	
	
	/*
     *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
         
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, 
         herhangi iki kenar farký diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c  
         b+c>a>b-c  
        a=b=c ise es kenar ucgen 
         
     */
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Lütfen 3 tane pozitif tamsayý giriniz");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a+b > c && a-b < c && a+c > b && a-c < b && b+c > a && b-c < a) {
			if(a==b && b==c) {
				System.out.println("Üçgeniniz Eþkenar");
			}else {
				System.out.println("Üçgenininz Eþkenar deðil");
			}
		}else {
			System.out.println("Girdiðiniz kenarlar bir üçgen belirtmez");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
