package _03_ifStatements;

import java.util.Scanner;

public class Q02 {
public static void main(String[] args) {
	
	
	/*
     *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
         
         ��gen olma sarti :herhangi iki kenar toplami diger kenardan b�y�k, 
         herhangi iki kenar fark� diger kenardan b�y�k olmali
         a+b>c>a-b
         a+c>b>a-c  
         b+c>a>b-c  
        a=b=c ise es kenar ucgen 
         
     */
	
		Scanner scan = new Scanner(System.in);
	
		System.out.println("L�tfen 3 tane pozitif tamsay� giriniz");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a+b > c && a-b < c && a+c > b && a-c < b && b+c > a && b-c < a) {
			if(a==b && b==c) {
				System.out.println("��geniniz E�kenar");
			}else {
				System.out.println("��genininz E�kenar de�il");
			}
		}else {
			System.out.println("Girdi�iniz kenarlar bir ��gen belirtmez");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
