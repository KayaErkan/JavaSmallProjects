package _03_ifStatements;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		 /*  Problem Tanýmý
        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
        (ipucu: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
        baðlantýsýndan yararlanabilirsiniz)
        Örnek Ekran Çýktýsý
        birinci kenarý giriniz: 2
        ikinci kenarý giriniz 15
        üçüncü kenarý giriniz: 7
        Bu bir dik üçgen deðildir.
        Bu bir dik üçgendir
     */
     

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen 3 tane pozitif tamsayý giriniz");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a+b > c && a-b < c && a+c > b && a-c < b && b+c > a && b-c < a) {
			if((a*a) + (b*b) == (c*c)) {
				System.out.println("Bu bir dik üçgendir");
			}else if ((a*a) + (c*c) == (b*b)) {
				System.out.println("Bu bir dik üçgendir");
			}else if ((b*b) + (c*c) == (a*a)) {
				System.out.println("Bu bir dik üçgendir");
			}else {
				System.out.println("Bu bir dik üçgen deðildir");
			}
		}else {
			System.out.println("Girdiðiniz kenarlar bir üçgen belirtmez");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
